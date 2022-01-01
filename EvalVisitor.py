if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor

funcs = {
    '+' : lambda x, y: x + y,
    '-' : lambda x, y: x - y,
    '*' : lambda x, y: x * y,
    '/' : lambda x, y: x // y,
    '%' : lambda x, y: x % y,
    '^' : lambda x, y: x ^ y,
    '==': lambda x, y: x == y,
    '<>': lambda x, y: x != y,
    '<':  lambda x, y: x < y,
    '>':  lambda x, y: x > y,
    '<=': lambda x, y: x <= y,
    '>=': lambda x, y: x >= y, 
    '&&': lambda x, y: (x == 1) and (y == 1),
    '||' : lambda x, y: (x == 1) or (y == 1),
}

def exists_func (f):
    x = (f == '+') or (f == '-') or (f == '*') or (f == '/') or (f == '^')
    x = x or (f == '==') or (f == '<>') or (f == '<') or (f == '>') or (f == '<=') or (f == '>=')
    x = x or (f == '&&') or (f == '||')
    return x

def is_float (x):
    xs = x.split ('.')
    return (len(xs) == 2 and xs[0].isnumeric() and xs[1].isnumeric())
        
class EvalVisitor(llullVisitor):
    def __init__(self, startFunc, params): 
        self.names = {
            'general': {}
        }
        self.act = Accio ()
        self.startFunc = startFunc
        self.params = params
        self.currentFunc = startFunc
        self.stack = []

    def visitRoot(self, ctx):      
        l = list(ctx.getChildren())   
        i = 0
        while i < len(l):
            if l[i].getText() != '<EOF>':
                if not (hasattr(l[i], 'getRuleIndex')) or llullParser.ruleNames[l[i].getRuleIndex()] != 'accio':
                    raise Exception ('Code should be organized in actions')
            self.visit(l[i])
            i += 1
        
        vars = self.act.buscarParms(self.startFunc, len(self.params))

        self.currentFunc = self.startFunc + str(len(self.params)) + '0'
        self.names[self.currentFunc] = {}
        i = 0
        for v in vars:
            self.names[self.currentFunc][v] = self.params[i]
            i += 1
        
        lines = self.act.buscarAccio(self.startFunc, len(self.params))
        for line in lines:
            self.visit(line)
        
        self.names.pop(self.currentFunc)

    def visitExpr(self, ctx):
        l = list(ctx.getChildren())
        if len(l) == 1:
            if is_float(l[0].getText()) == True:
                return float (l[0].getText()) #figure out how to implement floats
            elif l[0].getText().isnumeric():
                return int (l[0].getText())
            elif '"' in l[0].getText():
                return l[0].getText().strip('"')
            else:
                if 'get' in l[0].getText():
                    return self.visit(l[0])
                
                x = self.names[self.currentFunc][l[0].getText()]
                if x in self.names['general']:
                    return self.names['general'][x]
                
                return x
        if len(l) == 2:
            if l[0].getText() == '-':
                return (-1) * self.visit(l[1])
        else:  # len(l) == 3
            if l[0].getText() == '(':
                return self.visit(l[1])
            if exists_func (l[1].getText()) == False:
                raise Exception ('Illegal operator')
            
            a = self.visit(l[0])
            b = self.visit(l[2])
            if l[1].getText() == '/' and b == 0:
                raise Exception ('Division by 0')
            
            x = funcs[l[1].getText()] (a,b)
            if x == True: return 1
            elif x == False: return 0
            else: return x

    def visitAssig (self, ctx):
        l = list(ctx.getChildren())
        self.names[self.currentFunc][l[0].getText()] = self.visit(l[2])
    
    def visitAssig_operator (self, ctx):
        l = list(ctx.getChildren())
        a = self.names[self.currentFunc][l[0].getText()]
        b = self.visit(l[3])
        self.names[self.currentFunc][l[0].getText()] = funcs[l[1].getText()](a, b)
    
    def visitAssig_double (self, ctx):
        l = list(ctx.getChildren())
        a = self.names[self.currentFunc][l[0].getText()]
        if (l[1].getText() == '++'):
            self.names[self.currentFunc][l[0].getText()] = a + 1
        elif l[1].getText() == '--':
            self.names[self.currentFunc][l[0].getText()] = a - 1
        else:
            raise Exception ('Illegal Operator')
        
    def visitWrite (self, ctx):
        l = list(ctx.getChildren())
        i = 2
        x = ""
        while i < len(l) and not (hasattr(l[i], 'getSymbol') and l[i].getSymbol == llullParser.PARL):
            x = x + str(self.visit (l[i])) + ' '
            i += 2
        print(x)
    
    def visitRead (self, ctx):
        l = list(ctx.getChildren())
        rd = input ()
        if is_float(rd):
            self.names[self.currentFunc][l[2].getText()] = float (rd)
        elif rd.isnumeric():
            self.names[self.currentFunc][l[2].getText()] = int (rd)
        else:
            self.names[self.currentFunc][l[2].getText()] =  '"' + rd + '"'
    
    def visitIf_else (self, ctx):
        l = list(ctx.getChildren())
        met = False
        i = 0
        while (i < len(l) and not met):
            if l[i].getText() == 'if' or l[i].getText() == 'else if':
                i += 2
                if self.visit (l[i]) == 1:
                    met = True
                i += 3

            else:
                met = True
                i += 2
                
            while i < len(l) and hasattr(l[i], 'getRuleIndex') and (llullParser.ruleNames[l[i].getRuleIndex()] == 'expr' or llullParser.ruleNames[l[i].getRuleIndex()] == 'stat'):
                if met: self.visit (l[i])
                i += 1
            
            i += 1
    
    def visitCreate_array (self, ctx):
        l = list(ctx.getChildren())
        v = [0] * self.visit(l[4])
        self.names[self.currentFunc][l[2].getText()] = l[2].getText()
        self.names['general'][l[2].getText()] = v
    
    def visitGet_array (self, ctx):
        l = list(ctx.getChildren())
        i = self.visit(l[4])
        x = self.names['general'][self.names[self.currentFunc][l[2].getText()]]
        if i > len(x):
            raise Exception ('Null Pointer Exception')
        return x[i]
    
    def visitSet_array (self, ctx):
        l = list(ctx.getChildren())
        i = self.visit(l[4])
        x = self.names[self.currentFunc][l[2].getText()]
        if i > len(self.names['general'][x]):
            raise Exception ('Null Pointer Exception')
        self.names['general'][x][i] = self.visit(l[6])
    
    def visitWhile_loop(self, ctx):
        l = list(ctx.getChildren())
        while self.visit (l[2]) == 1:
            i = 5
            while i < (len(l)-1):
                self.visit(l[i])
                i += 1

    def visitFor_loop(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[2])
        while self.visit(l[4]) == 1:
            i = 9
            while i < (len(l)-1):
                self.visit(l[i])
                i += 1
            self.visit(l[6])
    
    def visitDo_while_loop(self, ctx):
        l = list(ctx.getChildren())
        while True:
            i = 2
            while i < len(l) and hasattr(l[i], 'getRuleIndex') and (llullParser.ruleNames[l[i].getRuleIndex()] == 'expr' or llullParser.ruleNames[l[i].getRuleIndex()] == 'stat'):
                self.visit (l[i])
                i += 1  
            
            i += 3
            if self.visit(l[i]) == 0: break
    
    def visitAccio (self, ctx):
        l = list(ctx.getChildren())
        info = {
           'name':  l[1].getText(),
           'params': [],
           'body': []
        }

        i = 3
        while i < len(l) and hasattr(l[i], 'getRuleIndex') and llullParser.ruleNames[l[i].getRuleIndex()] == 'ids':
            info['params'].append(l[i].getText())
            i += 2
        
        if (len(info['params']) == 0):
            i += 2
        else: i += 1
        
        while i < len(l) and hasattr(l[i], 'getRuleIndex') and llullParser.ruleNames[l[i].getRuleIndex()] == 'stat':
            info['body'].append(l[i])
            i += 1
        
        self.act.afegirAccio(info)
    
    def visitInvocacio(self, ctx):
        l = list(ctx.getChildren())
        info = {
           'name':  l[0].getText(),
           'params': [],
           'body': []
        }

        i = 2
        while i < len(l) and hasattr(l[i], 'getRuleIndex'):
            if llullParser.ruleNames[l[i].getRuleIndex()] == 'ids':
                if l[i].getText() in self.names[self.currentFunc]:
                    info['params'].append(self.names[self.currentFunc][l[i].getText()])
                else:
                    if l[i].getText() in self.names['general']:
                        info['params'].append(l[i].getText())
                    else:
                        info['params'].append(self.names[self.currentFunc][l[i].getText()])
            elif llullParser.ruleNames[l[i].getRuleIndex()] == 'expr':
                info['params'].append(self.visit(l[i]))
            else: 
                break
            i += 2

        vars = self.act.buscarParms(info['name'], len(info['params']))
        self.stack.append(self.currentFunc)
        self.currentFunc = info['name'] + str(len(info['params']))

        i = 0
        aux = self.currentFunc + str(i)
        while (aux in self.names):
            i += 1
            aux = self.currentFunc + str(i)

        self.currentFunc = aux
        self.names[self.currentFunc] = {}
        i = 0
        for v in vars:
            self.names[self.currentFunc][v] = info['params'][i]
            i += 1

        lines = self.act.buscarAccio(info['name'], len(info['params']))
        for line in lines:
            self.visit(line)
            
        self.names.pop(self.currentFunc)
        self.currentFunc = self.stack.pop()
        
class Accio:
    def __init__ (self):
        self.acc = {}

    def afegirAccio(self, info):
        if not (info['name'] in self.acc.keys()):
            self.acc[info['name']] = list ()
        else:
            for action in self.acc[info['name']]:
                if len(info['params']) == len(action['params']):
                    str = 'Redeclaration of action ' + action['name']
                    raise Exception(str)

        self.acc[info['name']].append(info)

    def buscarAccio(self, name, param):
        if not (name in self.acc.keys()):
            str = 'Function ' + name + ' does not exist'
            raise Exception(str)

        for action in self.acc[name]:
            if param == len(action['params']):
                return action['body']
        
        str = 'Function ' + name + ' does not exist'
        raise Exception(str)

    def buscarParms(self, name, params):
        if not (name in self.acc.keys()):
            str = 'Function ' + name + ' does not exist'
            raise Exception(str)

        for action in self.acc[name]:
            if params == len(action['params']):
                return action['params']
    
        str = 'Function ' + name + ' does not exist'
        raise Exception(str)
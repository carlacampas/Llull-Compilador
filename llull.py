if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import LlullParser
    from llullVisitor import llullVisitor

aritmetica = {
    '+' : lambda x, y: x + y,
    '-' : lambda x, y: x - y,
    '*' : lambda x, y: x * y,
    '/' : lambda x, y: x // y,
    '^' : lambda x, y: x ^ y
}

comparador = {
    '==': lambda x, y: x == y,
    '<>': lambda x, y: x != y,
    '<':  lambda x, y: x < y,
    '>':  lambda x, y: x > y,
    '<=': lambda x, y: x <= y,
    '>=': lambda x, y: x >= y 
}

def checkArit(var):
    return var == '+' or var == '*' or var == '/' or var == '-' or var == '^'
        
class EvalVisitor(llullVisitor):
    def visitRoot(self, ctx): 
        l = list(ctx.getChildren())        
        print(self.visit(l[0]))
    def visitExpr(self, ctx):
        l = list(ctx.getChildren())
        if len(l) == 1:
            return int(l[0].getText())
        else:  # len(l) == 3
            if l[0].getText() == '(':
                return self.visit(l[1])
            if checkArit(l[1].getText()):
                return aritmetica[l[1].getText()] (self.visit(l[0]), self.visit(l[2]))
            return comparador[l[1].getText()] (self.visit(l[0]), self.visit(l[2]))
    
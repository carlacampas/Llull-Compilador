from termcolor import colored

if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor


def is_float(x):
    xs = x.split(".")
    return len(xs) == 2 and xs[0].isnumeric() and xs[1].isnumeric()


class TreeVisitor(llullVisitor):
    def __init__(self):
        self.spaces = 0

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        i = 0
        while i < len(l):
            x = self.visit(l[i])
            if x is not None:
                print(x)
            i += 1

    def visitExpr(self, ctx):
        l = list(ctx.getChildren())
        if len(l) == 1:
            if (
                hasattr(l[0], "getRuleIndex") and
                llullParser.ruleNames[l[0].getRuleIndex()] == "get_array"
            ):
                return str(self.visit(l[0]))
            if is_float(l[0].getText()) or l[0].getText().isnumeric():
                return colored(l[0].getText(), "blue")
            return l[0].getText()

        if l[0].getText() == "(":
            return "(" + self.visit(l[1]) + ")"
        return (
            str(self.visit(l[0])) +
            " " +
            l[1].getText() +
            " " +
            str(self.visit(l[2]))
        )

    def visitAssig(self, ctx):
        l = list(ctx.getChildren())
        return l[0].getText() + " " + l[1].getText() + " " + self.visit(l[2])

    def visitAssig_double(self, ctx):
        l = list(ctx.getChildren())
        return l[0].getText() + l[1].getText()

    def visitAssig_operator(self, ctx):
        l = list(ctx.getChildren())
        return l[0].getText() + " " + l[1].getText() + "= " + self.visit(l[3])

    def visitWrite(self, ctx):
        l = list(ctx.getChildren())
        code = colored(l[0].getText(), "cyan") + l[1].getText()
        i = 2
        while i < len(l) and l[i].getText() != ")":
            code += l[i].getText()
            i += 1
            if l[i].getText() == ",":
                code += ", "
                i += 1

        code += l[i].getText()
        return code

    def visitRead(self, ctx):
        l = list(ctx.getChildren())
        ret = ""
        i = 0
        while i < len(l):
            ret = ret + l[i].getText()
            i += 1
        return ret

    def visitIf_else(self, ctx):
        l = list(ctx.getChildren())
        i = 0
        ret = ""
        while i < len(l):
            if i == 0:
                retLoop = l[i].getText()
            else:
                retLoop = l[i].getText()

            if l[i].getText() == "if" or l[i].getText() == "else if":
                retLoop += " ("
                i += 2
                retLoop += self.visit(l[i]) + ") {\n"
                i += 3

            else:
                retLoop += " {\n"
                i += 2

            self.spaces += 1
            while (
                i < len(l) and
                hasattr(l[i], "getRuleIndex") and (
                    llullParser.ruleNames[l[i].getRuleIndex()] == "expr" or
                    llullParser.ruleNames[l[i].getRuleIndex()] == "stat"
                )
            ):
                retLoop += " " * (self.spaces * 4) + self.visit(l[i]) + "\n"
                i += 1

            self.spaces -= 1
            retLoop += " " * (self.spaces * 4) + "} "
            i += 1
            ret += retLoop

        return ret

    def visitCreate_array(self, ctx):
        l = list(ctx.getChildren())
        i = 1
        ret = colored(l[0].getText(), "green")
        while i < len(l):
            ret += l[i].getText()
            if l[i].getText() == ",":
                ret += " "
            i += 1
        return ret

    def visitGet_array(self, ctx):
        l = list(ctx.getChildren())
        i = 1
        ret = colored(l[0].getText(), "green")
        while i < len(l):
            ret += l[i].getText()
            if l[i].getText() == ",":
                ret += " "
            i += 1
        return ret

    def visitSet_array(self, ctx):
        l = list(ctx.getChildren())
        i = 1
        ret = colored(l[0].getText(), "green")
        while i < len(l):
            ret += l[i].getText()
            if l[i].getText() == ",":
                ret += " "
            i += 1
        return ret

    def visitWhile_loop(self, ctx):
        l = list(ctx.getChildren())
        self.spaces += 1
        ret = l[0].getText() + "("

        i = 2
        while i < len(l) and l[i].getText() != ")":
            ret += str(self.visit(l[i]))
            i += 1

        ret += ") {\n"

        while i < len(l) and l[i].getText() != "}":
            x = self.visit(l[i])
            if x is not None:
                ret += " " * (self.spaces * 4) + x + "\n"
            i += 1

        self.spaces -= 1
        ret += " " * (self.spaces * 4) + "}"
        return ret

    def visitDo_while_loop(self, ctx):
        l = list(ctx.getChildren())
        self.spaces += 1
        ret = l[0].getText() + "{\n"
        i = 2

        while i < len(l) and l[i].getText() != "}":
            x = self.visit(l[i])
            if x is not None:
                ret += " " * (self.spaces * 4) + x + "\n"
            i += 1
        i += 3
        self.spaces -= 1

        ret += " " * (self.spaces * 4) + "} while ("
        while i < len(l) and l[i].getText() != ")":
            ret += str(self.visit(l[i]))
            i += 1
        ret += ")"

        return ret

    def visitFor_loop(self, ctx):
        self.spaces += 1

    def visitAccio(self, ctx):
        l = list(ctx.getChildren())
        self.spaces += 1
        ret = (
            colored(l[0].getText(), "red", attrs=["bold"]) +
            " " +
            colored(l[1].getText(), "magenta", attrs=["bold"]) +
            "("
        )
        i = 3
        while i < len(l) and l[i].getText() != ")":
            ret += l[i].getText()
            if l[i].getText() == ",":
                ret += " "
            i += 1

        ret += ") {\n"
        while i < len(l) and l[i].getText() != "}":
            x = self.visit(l[i])
            if x is not None:
                ret += " " * (self.spaces * 4) + x + "\n"
            i += 1

        self.spaces -= 1
        ret += " " * (self.spaces * 4) + "}\n"
        return ret

    def visitInvocacio(self, ctx):
        l = list(ctx.getChildren())
        i = 1
        ret = colored(l[0].getText(), "cyan")
        while i < len(l):
            if (
                hasattr(l[i], "getRuleIndex") and
                llullParser.ruleNames[l[i].getRuleIndex()] == "expr"
            ):
                ret += self.visit(l[i])
            else:
                ret += l[i].getText()
                if l[i].getText() == ",":
                    ret += " "
            i += 1

        return ret

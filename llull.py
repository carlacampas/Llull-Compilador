import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
from EvalVisitor import EvalVisitor


def is_float(x):
    xs = x.split(".")
    return len(xs) == 2 and xs[0].isnumeric() and xs[1].isnumeric()


file = open(sys.argv[1])
input_stream = InputStream(file.read())

startFunc = "main"
params = []
if len(sys.argv) > 2:
    startFunc = sys.argv[2]
    i = 3
    while i < len(sys.argv):
        aux = sys.argv[i]
        if is_float(aux):
            params.append(float(aux))
        elif aux.isnumeric():
            params.append(int(aux))
        else:
            params.append(aux)
        i += 1

lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

visitor = EvalVisitor(startFunc, params)
visitor.visit(tree)

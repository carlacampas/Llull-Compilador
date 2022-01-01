import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
#from TreeVisitor import TreeVisitor
from EvalVisitor import EvalVisitor

file = open(sys.argv[1])
input_stream = InputStream(file.read())

startFunc = 'main'
params = []
if len(sys.argv) > 2:
    startFunc = sys.argv[2]
    i = 3
    while i < len(sys.argv):
        params.append(sys.argv[i])
        i += 1

lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

visitor = EvalVisitor(startFunc, params)
visitor.visit(tree)
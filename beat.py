import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
from TreeVisitor import TreeVisitor

file = open(sys.argv[1])
input_stream = InputStream(file.read())

lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

visitor = TreeVisitor()
visitor.visit(tree)

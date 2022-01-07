# Generated from llull.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
else:
    from llullParser import llullParser

# This class defines a complete generic visitor for a parse tree produced by llullParser.

class llullVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by llullParser#root.
    def visitRoot(self, ctx:llullParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#accio.
    def visitAccio(self, ctx:llullParser.AccioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#stat.
    def visitStat(self, ctx:llullParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#expr.
    def visitExpr(self, ctx:llullParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#if_else.
    def visitIf_else(self, ctx:llullParser.If_elseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#while_loop.
    def visitWhile_loop(self, ctx:llullParser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#do_while_loop.
    def visitDo_while_loop(self, ctx:llullParser.Do_while_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#for_loop.
    def visitFor_loop(self, ctx:llullParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#assig.
    def visitAssig(self, ctx:llullParser.AssigContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#assig_operator.
    def visitAssig_operator(self, ctx:llullParser.Assig_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#assig_double.
    def visitAssig_double(self, ctx:llullParser.Assig_doubleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#read.
    def visitRead(self, ctx:llullParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#write.
    def visitWrite(self, ctx:llullParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#create_array.
    def visitCreate_array(self, ctx:llullParser.Create_arrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#get_array.
    def visitGet_array(self, ctx:llullParser.Get_arrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#set_array.
    def visitSet_array(self, ctx:llullParser.Set_arrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#invocacio.
    def visitInvocacio(self, ctx:llullParser.InvocacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#ids.
    def visitIds(self, ctx:llullParser.IdsContext):
        return self.visitChildren(ctx)



del llullParser
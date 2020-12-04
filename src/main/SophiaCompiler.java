package main;

import main.ast.nodes.Program;
import main.visitor.ASTTreePrinter;
import main.visitor.InnerClassNameAnalyzer;
import main.visitor.OuterClassNameAnalyzer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;

public class SophiaCompiler {
    public void compile(CharStream textStream) {
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);

        Program program = sophiaParser.sophia().sophiaProgram;
        ASTTreePrinter astTreePrinter = new ASTTreePrinter();

        InnerClassNameAnalyzer innerClassNameAnalyzer = new InnerClassNameAnalyzer();
        innerClassNameAnalyzer.visit(program);

        OuterClassNameAnalyzer outerClassNameAnalyzer = new OuterClassNameAnalyzer(innerClassNameAnalyzer.getStack(), innerClassNameAnalyzer.getRoot());
        outerClassNameAnalyzer.visit(program);

        if (innerClassNameAnalyzer.getNumOfErrors() + outerClassNameAnalyzer.getNumOfErrors() == 0)
            astTreePrinter.visit(program);
    }
}

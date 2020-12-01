package main;

import main.ast.nodes.Program;
import main.visitor.ASTTreePrinter;
import main.visitor.NameAnalyzer;
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
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(program);
        if (nameAnalyzer.getNumOfErrors() == 0)
            astTreePrinter.visit(program);
    }
}

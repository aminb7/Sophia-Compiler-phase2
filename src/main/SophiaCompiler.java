package main;

import main.ast.nodes.Program;
import main.visitor.ASTTreePrinter;
import main.visitor.InterClassNameAnalyzer;
import main.visitor.InfraClassNameAnalyzer;
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

        InterClassNameAnalyzer interClassNameAnalyzer = new InterClassNameAnalyzer();
        interClassNameAnalyzer.visit(program);

        InfraClassNameAnalyzer infraClassNameAnalyzer = new InfraClassNameAnalyzer(interClassNameAnalyzer.getStack(), interClassNameAnalyzer.getRoot());
        infraClassNameAnalyzer.visit(program);

        if (interClassNameAnalyzer.getNumOfErrors() + infraClassNameAnalyzer.getNumOfErrors() == 0)
            astTreePrinter.visit(program);
    }
}

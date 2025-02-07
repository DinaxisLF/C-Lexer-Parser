package com.dinaxis;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.util.concurrent.Callable;

import picocli.CommandLine;

@CommandLine.Command(name = "C++ Interpreter", mixinStandardHelpOptions = true, version =  "0.0.1", description = "C++ ALTNR4 Analizador")
public class App implements Callable<Integer> {

    @Override
    public Integer call() throws Exception{
        String input = "";
        Scanner scanner = new Scanner(System.in);

        do{
          System.out.println("Ingresa una cadena> ");
          input = scanner.nextLine();

          if(input.equals("exit")) continue;

            // Crear lexer y tokenizar la entrada
            CPPLexer lexer = new CPPLexer(CharStreams.fromString(input));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // Crear el parser
            CPPParser parser = new CPPParser(tokenStream);

            // Llamar a la regla inicial para obtener el árbol sintáctico
            ParseTree tree = parser.program(); // Suponiendo que 'program' es tu regla inicial

            // Imprimir el árbol sintáctico
            System.out.println("Árbol sintáctico:");
            System.out.println(tree.toStringTree(parser));

        }while(!input.equals("exit"));

            return 0;
    }

    public static void main(String[] args) {
        int exit = new CommandLine(new App()).execute(args);
        System.exit(exit);
    }
}

package com.dinaxis;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.util.concurrent.Callable;

import picocli.CommandLine;

@CommandLine.Command(name = "C++ Interpreter", mixinStandardHelpOptions = true, version =  "0.0.1", description = "C++ ALTNR4 Analizador")
public class App implements Callable<Integer> {
    // Andrade Perez Robin Axel
    // Alvarado Gutierrez Araceli
    // Lomeli Flores Cesar
    // Trujillo Madrigal Victor Adrian
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

            // Llamar a la regla inicial para obtener el arbol sintactico
            ParseTree tree = parser.program(); // Suponiendo que 'program' es tu regla inicial

            // Imprimir el arbol sintactico
            System.out.println("Arbol sintactico:");
            System.out.println(tree.toStringTree(parser));

        }while(!input.equals("exit"));
            scanner.close();
            return 0;
    }

    public static void main(String[] args) {
        System.out.println("// Andrade Perez Robin Axel\n" + //
                        "    // Alvarado Gutierrez Araceli\n" + //
                        "    // Lomeli Flores Cesar\n" + //
                        "    // Trujillo Madrigal Victor Adrian");
        int exit = new CommandLine(new App()).execute(args);
        System.exit(exit);
    }
}

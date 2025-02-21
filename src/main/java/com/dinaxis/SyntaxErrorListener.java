package com.dinaxis;
import org.antlr.v4.runtime.*;


/*
Andrade Pérez Robin Axel
Alvarado Gutierrez Araceli
Lomeli Flores Cesar
Trujillo Madrigal Víctor Adrián
 */

public class SyntaxErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        // Personaliza el mensaje de error
        String customMsg = "🔴 Error en línea " + line + ":" + charPositionInLine + " -> ";


        // Ajustes al mensaje de error
        if (msg.contains("mismatched input")) {
            // Extraer la parte que indica lo que se esperaba (si existe)
            int idx = msg.indexOf("expecting");
            String expected = "";
            if (idx != -1) {
                expected = msg.substring(idx);
            }
            customMsg += "Entrada no válida: se encontró '"
                    + ((Token) offendingSymbol).getText()
                    + "'. " + expected;
        } else if (msg.contains("token recognition error")) {
            customMsg += "Error de reconocimiento de token: " + ((Token) offendingSymbol).getText();
        } else {
            customMsg += msg;
        }
        // Imprime o registra el mensaje personalizado
        System.err.println(customMsg);
    }
}

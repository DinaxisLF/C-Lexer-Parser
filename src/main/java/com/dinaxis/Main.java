package com.dinaxis;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // Crear un JFileChooser para seleccionar un archivo
        JFileChooser fileChooser = new JFileChooser();
        // Change the initial directory for the file chooser
        fileChooser.setCurrentDirectory(new File("/shared"));
        fileChooser.setDialogTitle("Selecciona un archivo .cpp");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos C++", "cpp"));

        // Mostrar el diálogo de selección de archivo
        int userSelection = fileChooser.showOpenDialog(null);

        // Verificar si el usuario seleccionó un archivo
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            try {
                // Leer el archivo seleccionado
                CharStream input = CharStreams.fromFileName(filePath);

                // Crear el Lexer
                CPP14Lexer lexer = new CPP14Lexer(input);

                // Crear el stream de tokens
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                // Crear el Parser
                CPP14Parser parser = new CPP14Parser(tokens);

                // Parsear el archivo y obtener el árbol de análisis sintáctico
                ParseTree tree = parser.translationUnit();

                // Mostrar el árbol en una ventana gráfica
                JFrame frame = new JFrame("Árbol de Análisis Sintáctico");
                JPanel panel = new JPanel();
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.setScale(0.8); // Ajusta la escala

                // Envolver el TreeViewer en un JScrollPane
                JScrollPane scrollPane = new JScrollPane(viewer);

                // Agregar el JScrollPane al panel
                panel.add(scrollPane);

                // Configurar la ventana
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1200, 800); // Aumenta el tamaño de la ventana
                frame.setVisible(true);
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("No se seleccionó ningún archivo.");
        }
    }
}
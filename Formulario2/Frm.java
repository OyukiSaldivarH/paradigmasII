package Formulario2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Frm   {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Family");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,300);
        ventana.setLayout(new BorderLayout());

        JLabel imagenLabel = new JLabel(new ImageIcon("C://Users//user//Downloads//Familia.jpg"));
        imagenLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(2,2));

        class CuestionarioRetardado {
            private static final int RETARDO_PREGUNTA_MS = 3000; // Retardo en milisegundos entre preguntas

            private static JFrame ventana;
            private static JLabel preguntaLabel;
            private static JTextField respuestaTextField;
            private static Timer timer;
            private static int indicePregunta;

            private static String[] preguntas = {
                    "¿Cuál es la capital de Francia?",
                    "¿En qué año ocurrió la Revolución Francesa?",
                    "¿Cuántos planetas hay en el sistema solar?"
            };

            private static String[] respuestas = {
                    "París",
                    "1789",
                    "8"
            };

            public static void main(String[] args) {
                ventana = new JFrame("Cuestionario Retardado");
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setSize(400, 300);
                ventana.setLayout(new BorderLayout());

                preguntaLabel = new JLabel();
                preguntaLabel.setFont(new Font("Arial", Font.BOLD, 16));
                preguntaLabel.setHorizontalAlignment(JLabel.CENTER);
                ventana.add(preguntaLabel, BorderLayout.CENTER);

                respuestaTextField = new JTextField();
                respuestaTextField.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        verificarRespuesta();
                    }
                });
                ventana.add(respuestaTextField, BorderLayout.SOUTH);

                indicePregunta = 0;
                mostrarSiguientePregunta();

                ventana.setVisible(true);
            }

            private static void mostrarSiguientePregunta() {
                if (indicePregunta < preguntas.length) {
                    preguntaLabel.setText(preguntas[indicePregunta]);
                    respuestaTextField.setText("");
                    respuestaTextField.setEnabled(false);

                    timer = new Timer(RETARDO_PREGUNTA_MS, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            respuestaTextField.setEnabled(true);
                            respuestaTextField.requestFocus();
                            timer.stop();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();

                    indicePregunta++;
                } else {
                    JOptionPane.showMessageDialog(ventana, "¡Cuestionario completado!", "Fin del cuestionario", JOptionPane.INFORMATION_MESSAGE);
                    ventana.dispose();
                }
            }

            private static void verificarRespuesta() {
                String respuestaUsuario = respuestaTextField.getText().trim();
                String respuestaCorrecta = respuestas[indicePregunta - 1];

                if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
                    JOptionPane.showMessageDialog(ventana, "¡Respuesta correcta!", "Retroalimentación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(ventana, "Respuesta incorrecta. La respuesta correcta es: " + respuestaCorrecta,
                            "Retroalimentación", JOptionPane.ERROR_MESSAGE);
                }

                mostrarSiguientePregunta();
            }
        }

        ventana.add(imagenLabel, BorderLayout.CENTER);

        ventana.setVisible(true);

    }



}

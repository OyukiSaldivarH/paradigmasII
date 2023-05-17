package Lenguaje;

import java.util.LinkedList;
import java.util.Scanner;

public class LenguajesDeProgramacionMenu {
    private static LinkedList<String> listaLenguajesProgramacion = new LinkedList<>();


    public static void main(String[] args) {
        System.out.println("Programa elabotado por Oyuki Saldivar Hernandez");
        listaLenguajesProgramacion.add("C++");

    }

    Scanner scanner = new Scanner(System.in);
    int opcion = 0;



    {
        System.out.println("Lenguajes de Programación 2023");
        System.out.println("1. Añadir elemento");
        System.out.println("2. Añadir elemento al final");
        System.out.println("3. Añadir elemento al principio");
        System.out.println("4. Mostrar lista de lenguajes");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.print("Ingrese el lenguaje a agregar: ");
                String lenguaje = scanner.next();
                anadirElemento(lenguaje);
                break;
            case 2:
                System.out.print("Ingrese el lenguaje a agregar al final: ");
                String lenguajeFinal = scanner.next();
                anadirElementoAlFinal(lenguajeFinal);
                break;
            case 3:
                System.out.print("Ingrese el lenguaje a agregar al principio: ");
                String lenguajePrincipio = scanner.next();
                anadirElementoAlPrincipio(lenguajePrincipio);
                break;
            case 4:
                mostrarLista();
                break;
            case 5:
                System.out.println("¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                break;
        }
    }




            public static void anadirElemento(String lenguaje) {
                listaLenguajesProgramacion.add(lenguaje);
                System.out.println("Lenguaje agregado exitosamente.");
            }

            public static void anadirElementoAlFinal(String lenguaje) {
                listaLenguajesProgramacion.addLast(lenguaje);
                System.out.println("Lenguaje agregado al final exitosamente.");
            }

            public static void anadirElementoAlPrincipio(String lenguaje) {
                listaLenguajesProgramacion.addFirst(lenguaje);
                System.out.println("Lenguaje agregado al principio exitosamente.");
            }

            public static void mostrarLista() {
                System.out.println("Lista de lenguajes:");
                for (String lenguaje : listaLenguajesProgramacion) {
                    System.out.println(lenguaje);
                }
            }
        }

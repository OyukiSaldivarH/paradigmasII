package ComparadorPersona;

import java.util.*;

public class Main {
    public static void main (String[]args){
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pedro","picapiedra",40));
        listaPersonas.add(new Persona("Pablo","Marmol",30));
        listaPersonas.add(new Persona("Vilma","De picapiedra",35));
        listaPersonas.add(new Persona("Betty","Marmol",25));
        listaPersonas.add(new Persona("Tony","Stark",56));
        listaPersonas.add(new Persona("Bella","Stark",56));
        listaPersonas.add(new Persona("Bella","Stark",12));
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5 Opcion 5");
            System.out.println("6 Opcion 6");
            System.out.println("7. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Elementos desordenados:");
                        listaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();

                        break;
                    case 2:
                        Collections.sort(listaPersonas, new ComparadorEdad());
                        System.out.println("Elementos de la lista ordenados por edad: ");
                        listaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();
                        break;
                    case 3:
                        Collections.sort(listaPersonas, new ComparadorNombre());
                        System.out.println("Elementos de la lista ordenados por Nombre: ");
                        listaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();
                        break;
                    case 4:
                        Collections.sort(listaPersonas, new ComparadorApellidos());
                        System.out.println("Elementos de la lista ordenados por Apellidos: ");
                        listaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();

                        break;
                    case 5:
                        Collections.sort(listaPersonas, new ComparadorNombreEdad());
                        System.out.println("Elementos Compardos de Nombre a edad: ");
                        listaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();

                        break;

                    case 6:
                        Collections.sort(listaPersonas, new ComparadorEdadNombre());
                        System.out.println("Elementos Compardos de Edad a Nombre : ");
                        listaPersonas.forEach(persona -> System.out.println(persona));
                        System.out.println();

                        break;

                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
    }


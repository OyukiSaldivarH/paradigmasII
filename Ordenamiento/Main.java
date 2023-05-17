package Ordenamiento;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[]args) {
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Epadas"};

        //Crea y muestra una lista que contiene los elementos dela arreglo palos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desordenados: %s%n",lista);
// ordena de forma descendente usando un comoparador
        Collections.sort(lista,Collections.reverseOrder());
        System.out.printf("Elementos ordenados de forma decendente: %s%n",lista);
    }
    }


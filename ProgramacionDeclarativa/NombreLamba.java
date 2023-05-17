package ProgramacionDeclarativa;

import java.util.function.BiConsumer;

public class NombreLamba {
    public static void main(String[]args){
        BiConsumer<String, String> bienvenida = (nombre,apellido)-> System.out.println("Bienvenida "+ nombre + " " +apellido);
        bienvenida.accept("Oyuki","Saldivar");
    }

}

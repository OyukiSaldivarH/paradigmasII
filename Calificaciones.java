import java.util.stream.DoubleStream;

public class Calificaciones {
    public static void main(String[] args) {
        double[] calificaciones = {3.2, 10.0, 6.7, 5.1, 4.6, 7.8, 8.2, 7.5, 5.8, 8.7};

        //  Imprimir las calificaciones originales
        System.out.println("Calificaciones Originales");
        DoubleStream.of(calificaciones)
                .forEach(v -> System.out.print(v + " "));

        //Promedio de los que pasaron
        System.out.println();
        System.out.println("Promedio de los que pasaron");
        System.out.println(DoubleStream.of(calificaciones)
                .filter(v -> v > 6)
                .average()
                .getAsDouble());
        //Numero de alumnos reprobados
        System.out.println("Numero de los que reprobaron");
        System.out.println(DoubleStream.of(calificaciones)
                .filter(v -> v< 6)
                .count());
        //Calificacion maxima de los que estan estre 6 y 8
        System.out.println("Calificacion Maxima");
        System.out.println(DoubleStream.of(calificaciones)
                .filter(v -> v > 6)
                .filter(v -> v <8)
                .max()
                .getAsDouble());
        //Calificacion Minima de los que estan entre 4.0 y 6.0
        System.out.println("Calificacion Minima");
        System.out.println(DoubleStream.of(calificaciones)
                .filter(v -> v > 4)
                .filter(v -> v < 6)
                .min()
                .getAsDouble());
        //Sumar un punto a todo y mostrarlos
        System.out.println("Calificacion mas 1 punto");
        DoubleStream.of(calificaciones)
                .map(v ->v+1)
                .forEach(System.out::println);
    }
}


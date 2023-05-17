package Ventas;

import java.util.stream.DoubleStream;

public class VentasSemana {
    public static void main(String[]args){
        double ventas []= {34.0,4500.0,1589.0,1500.0,9999.0,8999.0,5500.0};


                //Impresion de los datos en el arreglo
                System.out.println("Imprimir datos del stream");
                DoubleStream.of(ventas)
                        .forEach(v -> System.out.print(v+ " "));

                //Impresion de la cantidades mayores a 1000
                System.out.println();
                System.out.println("Datos mayores a 1000");
                DoubleStream.of(ventas)
                        .filter(v -> v > 1000)
                        .forEach(v -> System.out.print(v+ " "));
                //Total de ventas
                System.out.println();
                System.out.println("Total de ventas");
                double totalVentas = DoubleStream.of(ventas).sum();
                System.out.println("El total de ventas es: " + totalVentas);
                //Venta Maxima
                System.out.println("Venta maxima");
                System.out.println(DoubleStream.of(ventas)
                        .filter(d->d >1000)
                        .filter(d->d <2000)
                        .max()
                        .getAsDouble());
                //VentaMinima
                System.out.println("Venta minima entre 0 y 5000");
                System.out.println(DoubleStream.of(ventas)
                        .filter(v -> v > 0)
                        .filter(v ->v  < 5000)
                        .min()
                        .getAsDouble());

                //Promedioventas
                System.out.println("Promedio de las ventas");
                System.out.println(DoubleStream.of(ventas)
                        .average()
                        .getAsDouble());
            }
        }



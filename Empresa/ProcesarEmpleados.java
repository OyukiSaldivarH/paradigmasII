package Empresa;

import java.util.Arrays;
import java.util.List;

public class ProcesarEmpleados {
    public static void main(String[] args) {
        // Recuperar los datos de un archivo de texto
        Archivo archivox = new Archivo("empleados.txt");
        archivox.crearArchivo();
        List<Empleados> listaEmpleados = archivox.leerDeArchivo();
        System.out.println("Programa Elaborado por Oyuki");
        // Muestra a todos los empleados
        System.out.println("Lista completa de empleados");


        //Muestra todos los empleados
        System.out.println("Lista completa de empleados");
        imprimirEncabezado();
        listaEmpleados.stream().forEach(System.out::println);
        imprimirRenglon();

        //Imprimir empleados que su apellidos cuyo apellido sea Vazquez
        System.out.println("Lista de empleados cuyo apellido sean Vazquez");
        imprimirEncabezado();
        listaEmpleados.stream()
                .filter(empleado -> empleado.getApellidoPaterno().equals("Vazquez"))
                .forEach(System.out::println);
        imprimirRenglon();

        //Imprimir todos la suma de los salarios de los empleados
        System.out.println("Suma de salarios de los empleados(Con el metodo sum)");
        double sumaSalario = listaEmpleados.stream()
                .mapToDouble(Empleados::getSalario)
                .sum();
        System.out.printf("La suma de los salarios es: %.2f", sumaSalario);
        imprimirRenglon();

        //Imprimir suma de salarios mayores o iguales a 10000
        System.out.println("Suma de los salarios mayores a 10000");
        double sumaSalario1000 = listaEmpleados.stream()
                .mapToDouble(Empleados::getSalario)
                .filter(salario -> salario >= 10000)
                .sum();
        System.out.printf("La suma de los salarios mayores a 10000 es: %.2f", sumaSalario1000);
        imprimirRenglon();

        //Mostrar nombres y apellidos de los empledos cuyo departamento sea marketing
        System.out.println("\nEmpleados en el departamento de Marketing:");
        listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Marketing"))
                .forEach(empleado -> System.out.printf("%s %s%n", empleado.getPrimerNombre(), empleado.getApellidoPaterno()));
        imprimirRenglon();

        //Salario mas alto de los que trabajan en TI
        double salarioMaximoTI = listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("TI"))
                .mapToDouble(Empleados::getSalario)
                .max()
                .orElse(0.0);
        System.out.printf("\nEl salario mas alto en el departamento de TI es: $%,.2f%n", salarioMaximoTI);
        imprimirRenglon();

        //Empleados en ventas
        long cantidadEmpleadosVentas = listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Ventas"))
                .count();
        System.out.printf("\nHay %d empleados en el departamento de Ventas.%n", cantidadEmpleadosVentas);

    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("---------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%12s %12s %12s %12s%n", "Nombre", "Apellidos",
                "Salario", "Departamento");
        System.out.println("-------------------------------------------------");
    }
}



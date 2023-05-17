package ComparadorDeEmpleados;
import java.util.InputMismatchException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Jonathan", 6454, "Administracion", "Supervisor", 1000));
        listaEmpleados.add(new Empleado("Jesus", 1222, "Supervicion", "Gerente", 3060));
        listaEmpleados.add(new Empleado("Jose", 45653, "Supervicion", "SubGerente", 12000));
        listaEmpleados.add(new Empleado("Diego", 2894, "Administracion", "Contador", 6000));
        listaEmpleados.add(new Empleado("Griselda", 1355, "Oficina", "SubJefa", 7500));
        listaEmpleados.add(new Empleado("Oyuki", 7866, "Oficina ", "Jefa", 98000));
        listaEmpleados.add(new Empleado("Said", 71327, "Supervicion", "Secretario", 6900));
        listaEmpleados.add(new Empleado("Denisse", 1231, "Ingenieria", "Ingeniero", 23000));
        listaEmpleados.add(new Empleado("Luis", 3422, "Administracion", "Colaborardor", 3500));
        listaEmpleados.add(new Empleado("Nadia", 3123, "Contaduria", "SubGerente", 1000));
        listaEmpleados.add(new Empleado("Lucero", 4124, "Direccion", "Administrador", 5000));
        listaEmpleados.add(new Empleado("Axel", 14214, "Ingeniero", "Ingeniero", 2380));
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1. Desorden ");
            System.out.println("2. Ordenar por Salario");
            System.out.println("3. Ordenar por Departamento ");
            System.out.println("4. Ordenar por Departamento y por puesto  ");
            System.out.println("5 Ordenar por departamento y Salario ");
            System.out.println("6 Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Elementos desordenados:");
                        listaEmpleados.forEach(Empleado -> System.out.println(Empleado));
                        System.out.println();

                        break;
                    case 2:
                        Collections.sort(listaEmpleados, new ComparadorSalario());
                        System.out.println("Elementos de la lista ordenados por Salario: ");
                        listaEmpleados.forEach(Empleado -> System.out.println(Empleado));
                        System.out.println();
                        break;
                    case 3:
                        Collections.sort(listaEmpleados, new CompardorDepartamentos());
                        System.out.println("Elementos de la lista ordenados por Departamento: ");
                        listaEmpleados.forEach(Empleado -> System.out.println(Empleado));
                        System.out.println();
                        break;
                    case 4:
                        Collections.sort(listaEmpleados, new CompardorDepartamentoPuesto());
                        System.out.println("Elementos de la lista ordenados por Departamento y por Puesto ");
                        listaEmpleados.forEach(Empleado -> System.out.println(Empleado));
                        System.out.println();

                        break;
                    case 5:
                        Collections.sort(listaEmpleados, new ComparadorDepartamentoSalario());
                        System.out.println("Elementos Compardos de Departamento a Salrio: ");
                        listaEmpleados.forEach(Empleado -> System.out.println(Empleado));
                        System.out.println();
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un n1úmero");
                sn.next();
            }
        }

    }
}


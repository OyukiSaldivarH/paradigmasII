package Empresa;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
    private String nombreArchivo;

    public Archivo(String nombreA) {
        this.nombreArchivo = nombreA;
    }

    public void crearArchivo() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
                System.out.println("El archivo" + nombreArchivo + " se ha creado");
                salidaArchivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirEnArchivo(ArrayList<Empleados> listaEmpleados) {
        try {
            PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
            for (Empleados empleaux : listaEmpleados) {
                salidaArchivo.println(empleaux.formatoArchivo());

            }
            salidaArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//FIN DE ESCRIBIR EN ARCHIVO

    public ArrayList<Empleados> leerDeArchivo() {
        ArrayList<Empleados> ListaEmpleado = new ArrayList<>();
        try {
            // Abrir el archivo
            File archivoLectura = new File(nombreArchivo);
            Scanner leerArchivo = new Scanner(archivoLectura);
            // Leer el archivo
            while (leerArchivo.hasNext()) {
                String linea = leerArchivo.nextLine();
                String[] valores = linea.split("\\|"); //Dividir por |
                String nombre = valores[0];
                String apellido = valores[1];
                String departamento = valores[3];
                double salario = Double.parseDouble(valores[2]);
                Empleados emplAux = new Empleados(nombre, apellido, salario, departamento);
                ListaEmpleado.add(emplAux);
            }// Cerrar el archivo
            leerArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListaEmpleado;
    } // fin de leerDeArchivo

}


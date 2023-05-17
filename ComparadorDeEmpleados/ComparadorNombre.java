package ComparadorDeEmpleados;

import ComparadorPersona.Persona;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Empleado> {
     public int compare (Empleado empleado1, Empleado empleado2){
         return empleado1.getNombre().compareTo(empleado2.getNombre());
     }

}

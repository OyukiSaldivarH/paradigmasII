package ComparadorDeEmpleados;

import java.util.Comparator;

public class CompardorDepartamentos implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
    }
}

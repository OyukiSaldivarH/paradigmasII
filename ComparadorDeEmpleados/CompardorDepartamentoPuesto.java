package ComparadorDeEmpleados;

import java.util.Comparator;

public class CompardorDepartamentoPuesto implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        if (empleado1.getDepartamento().compareTo(empleado2.getDepartamento()) != 0) {
            return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
        }
        return empleado1.getPuesto().compareTo(empleado2.getPuesto());
    }
}


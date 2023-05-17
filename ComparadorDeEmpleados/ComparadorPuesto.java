package ComparadorDeEmpleados;

import java.util.Comparator;

public class ComparadorPuesto implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        return empleado1.getPuesto().compareTo(empleado2.getPuesto());
    }
}

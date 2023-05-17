package ComparadorDeEmpleados;

import ComparadorPersona.Persona;

import java.util.Comparator;

public class CompardorIdNumero implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {

            if (empleado1.getIdNumero() == empleado2.getIdNumero()){
                return 0;
            }else if (empleado1.getIdNumero()> empleado2.getIdNumero())

            {
                return 1;
            } else

            {
                return -1;
            }
        }
    }




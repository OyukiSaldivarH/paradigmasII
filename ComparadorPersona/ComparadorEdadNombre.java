package ComparadorPersona;

import java.util.Comparator;

public class ComparadorEdadNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {

        // primero vamos a comparar la edad
        if (persona1.getEdad() > persona2.getEdad() ){
            return 1;

        } else if (persona1.getEdad()<persona2.getEdad()){
            return -1;
        }
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}

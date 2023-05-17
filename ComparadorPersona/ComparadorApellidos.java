package ComparadorPersona;

import java.util.Comparator;

public class ComparadorApellidos implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2){
        return persona1.getApellido().compareTo(persona2.getApellido());
    }
}

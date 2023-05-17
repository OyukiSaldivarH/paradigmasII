import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import javax.swing.JPanel;


public class FrmConteoPalabras extends JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Map<String,Integer> frecuencias = new HashMap<>();

    // se declara el constructor del formulario
    public FrmConteoPalabras(){
        initComponents();
        crearMapa();
        llenarTabla();

    }
    private void crearMapa (){
        String enunciado = "mapa mapa zona";
        String[] tokens = enunciado.split("  ");
        // procesamiento del texto de entrada
        for (String token : tokens){
            String palabra = token.toLowerCase();
            if (frecuencias.containsKey(palabra)) {
            int cuenta = frecuencias.get(palabra);
            frecuencias.put(palabra, cuenta + 1);
        } else{
            frecuencias.put(palabra, 1);

        }
    }

}
private void llenarTabla() {
    // se pasan los datos de personasMilenarias a la Jtable
    Object[] fila = new Object[2];
    Set<String> claves = frecuencias.keySet();
    // ordenar las claves
    TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
    for (String clave : clavesOrdenadas) {
        fila[0] = clave;
        fila[1] =frecuencias.get(clave);
        model.addRow(fila);
    }
}
private void initComponents () {
    JPanel panel = new JPanel(new BorderLayout());
    // crear una tabla
    JTable table = new JTable(model);
    model.addColumn("palabra");
    model.addColumn("No. de ocurrencias ");
    panel.add(table.getTableHeader(), BorderLayout.NORTH);
    // agrega el contenido de la tabla el centro del contenedor
    panel.add(table, BorderLayout.CENTER);
    setContentPane(panel);
    // caracteristicas de la ventana
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(400, 400);
        setTitle("Frecuencia de las palabras de un archivo de texto ");
    setLocationRelativeTo(null);
}
// se declara el metdo main para ejecutar el formulario
    public static void main (String[]args) {
        new FrmConteoPalabras().setVisible(true);
    }
}
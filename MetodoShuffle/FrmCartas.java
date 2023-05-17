package MetodoShuffle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrmCartas extends JFrame {
    // se declaran las variables que ocupara el formulario
    MazoDeCartas cartas;
    private List<Carta> ListaCartas;

    // se declaran el constructor del formulario
    public FrmCartas() {
        initComponents();
        revolverCartas();

    }

    // se declaran los metodos que ocuparan el formulario por parte del usuario
    public void revolverCartas() {
        cartas = new MazoDeCartas();
        ListaCartas = cartas.getListaCartas();
        agregarImagenes();
    }

    public void agregarImagenes() {
        asignarImagen(ListaCartas.get(0).toString(), imagen1);
        asignarImagen(ListaCartas.get(1).toString(), imagen2);
        asignarImagen(ListaCartas.get(2).toString(), imagen3);
        asignarImagen(ListaCartas.get(3).toString(), imagen4);
        asignarImagen(ListaCartas.get(4).toString(), imagen5);
        asignarImagen(ListaCartas.get(5).toString(), imagen6);
        asignarImagen(ListaCartas.get(6).toString(),imagen7);

    } ///Fin de agregar imagenes

    public void asignarImagen(String nombreImagen, JLabel imagen) {
        ImageIcon picture;
        try {
            String carperta = "cartas/";
            picture = new ImageIcon(getClass().getResource(carperta + nombreImagen + ".png"));
            Icon imgEscalada = new ImageIcon(picture.getImage()
                    .getScaledInstance(imagen.getWidth(),
                            imagen.getHeight(), Image.SCALE_SMOOTH));
            imagen.setIcon(imgEscalada);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // se declara un metodo para inicializar los componentes del formulario
    private void initComponents() {
        imagen1 = new JLabel();
        imagen2 = new JLabel();
        imagen3 = new JLabel();
        imagen4 = new JLabel();
        imagen5 = new JLabel();
        imagen6 = new JLabel();
        imagen7 = new JLabel();
        lblTitulo = new JLabel();
        btnRevolver = new JButton("Revolver cartas");
        btnRevolver.setForeground(Color.black);
        btnRevolver.setBackground(Color.pink);
        btnRevolver.setFont(new Font("Dialog", 0, 30));
        btnRevolver.setPreferredSize(new Dimension(100, 60));
        btnRevolver.setHorizontalAlignment(SwingConstants.CENTER);
        // Caracteristicas de la ventana
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 900);
        setLocationRelativeTo(null);
        // Establecer un layout de 3 renglones y una columna
        setLayout(new GridLayout(3, 1, 10, 10));
        // Caracteristicas del  titulo
        lblTitulo.setFont(new Font("Dialog", 0, 48));
        lblTitulo.setText("JUEGO DE CARTAS");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setPreferredSize(new Dimension(100, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);
        add(btnRevolver);
        // eventos del boton

        btnRevolver.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        revolverCartas();
                    }

                }
        );
        // Panel donde se colocaran las imagenes
        panelImagenes = new JPanel();
        panelImagenes.setBackground(Color.black);
        panelImagenes.setLayout(new GridLayout(1, 5, 10, 10));
        add(panelImagenes);
        // se establecen los tamanos de las etiquetas y se agregan al panel
        int altura = 180;
        int anchura = 120;
        imagen1.setSize(anchura, altura);
        imagen2.setSize(anchura, altura);
        imagen3.setSize(anchura, altura);
        imagen4.setSize(anchura, altura);
        imagen5.setSize(anchura, altura);
        imagen6.setSize(anchura,altura);
        imagen7.setSize(anchura,altura);
        panelImagenes.add(imagen1);
        panelImagenes.add(imagen2);
        panelImagenes.add(imagen3);
        panelImagenes.add(imagen4);
        panelImagenes.add(imagen5);
        panelImagenes.add(imagen6);
        panelImagenes.add(imagen7);

    }

    // se declara el metodo main para ejecutar el formulario
    public static void main(String[] args) {
        new FrmCartas().setVisible(true);

    }

    // se declaran los controles que llevara el formulario
    private JLabel lblTitulo;
    private JLabel imagen1;
    private JLabel imagen2;
    private JLabel imagen3;
    private JLabel imagen4;
    private JLabel imagen5;
    private JLabel imagen6;
    private JLabel imagen7;
    private JButton btnRevolver;
    JPanel panelImagenes;
}

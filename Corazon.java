
    import java.awt.*;

    public class Corazon extends Frame {

        public static void main(String[] args) {
            new Corazon();
        }

        public Corazon() {
            super("Corazon");
            setSize(300, 300);
            setVisible(true);
        }

        public void paint(Graphics g) {
            g.setColor(Color.RED);

            // Dibujar el corazón
            int x[] = { 150, 130, 110, 110, 130, 150, 170, 190, 190 };
            int y[] = { 100, 80, 100, 120, 130, 140, 130, 120, 100 };
            g.fillPolygon(x, y, 9);
            g.fillOval(120, 70, 60, 60);
            g.fillOval(170, 70, 60, 60);
        }
    }


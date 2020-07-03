package head.first.java.chapter12;
import java.awt.*;
import javax.sound.midi.*;
import javax.swing.*;
public class MyDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;
    @Override
    public void paintComponent(Graphics g) {
        //g.setColor(Color.orange);
        //g.fillRect(20,50, 100, 100);
        if (msg) {
            Graphics2D g2 = (Graphics2D) g;
            int r = (int)(Math.random() * 250);
            int gr = (int)(Math.random() * 250);
            int b = (int)(Math.random() * 250);
            g.setColor(new Color(r,gr,b));
            int ht = (int) (Math.random() * 120) + 10;
            int width = (int) (Math.random() * 120) + 10;
            int x = (int) (Math.random() * 40) + 10;
            int y = (int) (Math.random() * 40) + 10;
            g.fillRect(x, y, width, ht);
            msg = false;
        }
        Image image = new ImageIcon("D:\\picture\\psc.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }

    @Override
    public void controlChange(ShortMessage shortMessage) {
        msg = true;
        repaint();
    }
}

package head.first.java.chapter12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGui implements ActionListener {

    /*public void actionPerformed(ActionEvent event) {

    }*/
    JFrame frame;
    JButton button;
    public void go() {
        frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);

        MyDrawPanel panel = new MyDrawPanel();
        //panel.paintComponent();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //button.setText("I've been clicked!");
        frame.repaint();
    }
}

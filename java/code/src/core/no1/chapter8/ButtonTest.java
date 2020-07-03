package core.no1.chapter8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HIGH = 200;
    private JPanel buttonPanel;
    public ButtonFrame() {
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HIGH);

        // create Button
        JButton yellowButton = new JButton("<html><b>Ok</b></html>"); // "Yellow"
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        add(buttonPanel);

        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }
    private class ColorAction implements ActionListener {
        public Color backgroundColor;
        public ColorAction(Color c) {
            backgroundColor = c;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}

public class ButtonTest {
    public static void main(String []args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ButtonFrame frame = new ButtonFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}


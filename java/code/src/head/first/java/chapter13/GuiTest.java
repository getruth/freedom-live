package head.first.java.chapter13;

import javax.swing.*;
import java.awt.*;

public class GuiTest {
    public void makeGUI() {
        // 创建Windows
        JFrame frame = new JFrame();
        // 创建组件
        JButton button = new JButton("click me!");
        // 把组件加到frame上
        frame.getContentPane().add(BorderLayout.CENTER, button);
        // 显示出来
        frame.setSize(300, 300);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation();

    }
}

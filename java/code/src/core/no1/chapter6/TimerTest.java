package core.no1.chapter6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args) {
        TalkingClock t = new TalkingClock(1000, true);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}

class TalkingClock
{
    int interval = 100;
    boolean beep = false;
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener = this.new TimerPrint();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    class TimerPrint implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (TalkingClock.this.beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}


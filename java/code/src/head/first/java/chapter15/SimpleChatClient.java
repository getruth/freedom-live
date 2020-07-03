package head.first.java.chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class SimpleChatClient {
    JTextField outgoing;
    JTextArea inComing;
    BufferedReader reader;
    PrintWriter printWriter;
    Socket socket;
    public void go() {
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel =new JPanel();
        inComing = new JTextArea(15, 50);
        inComing.setLineWrap(true);
        inComing.setWrapStyleWord(true);
        inComing.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(inComing);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(scrollPane);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetWorking();

        Thread readThread = new Thread(new IncomingReader());
        readThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
    private class SendButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                printWriter.println(outgoing.getText());
                printWriter.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
    private void setUpNetWorking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            printWriter = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public class IncomingReader implements Runnable{

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("client read: " + message);
                    inComing.append(message + '\n');
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

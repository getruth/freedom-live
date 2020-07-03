package head.first.java.chapter15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleChatServer {
    ArrayList clientOutPutStream;
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket socket;
        public ClientHandler(Socket clientSocket) {
            try {
                socket = clientSocket;
                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(inputStreamReader);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("server read: " + message);
                    tellEveryOne(message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void go() {
        clientOutPutStream = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutPutStream.add(writer);
                Thread thread = new Thread(new ClientHandler(clientSocket));
                thread.setName("Server");
                thread.start();
                System.out.println("got a connection");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void tellEveryOne(String message) {
        Iterator it = clientOutPutStream.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

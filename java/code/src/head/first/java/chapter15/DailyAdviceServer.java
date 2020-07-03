package head.first.java.chapter15;
import java.io.*;
import java.net.*;

public class DailyAdviceServer {
    String[] adviceList = {
        "Take smaller bites", "Go for the tight jeans.No they do NOT make you look fat.",
            "One Word", "Just for today,", "You might want to thanks that hiarcut."
    };
    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true) {
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

}

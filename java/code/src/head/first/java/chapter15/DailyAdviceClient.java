package head.first.java.chapter15;
import java.io.*;
import java.net.Socket;

public class DailyAdviceClient {
    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String advice = bufferedReader.readLine();
            System.out.println("Today you should: " + advice);
            streamReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

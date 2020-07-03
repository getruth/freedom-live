package head.first.java.chapter15;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        /*
        try {
            // 建立连接
            Socket charSocket = new Socket("192.168.31.155", 5000);
            // 从socket获取输入
            InputStreamReader streamReader = new InputStreamReader(charSocket.getInputStream());

            // 读取数据
            BufferedReader reader = new BufferedReader(streamReader);
            String message = reader.readLine();

            PrintWriter printWriter = new PrintWriter(charSocket.getOutputStream());
            printWriter.println("Message send...");

        } catch (Exception ex) {

        }
        */
        /*
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
        */
        //ThreadTestDrive threadTestDrive = new ThreadTestDrive();
        //threadTestDrive.go();

        SimpleChatClient simpleChatClient = new SimpleChatClient();
        simpleChatClient.go();
        SimpleChatServer simpleChatServer = new SimpleChatServer();
        simpleChatServer.go();
    }
}

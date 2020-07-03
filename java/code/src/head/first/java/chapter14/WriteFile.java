package head.first.java.chapter14;

import java.io.*;

public class WriteFile {
    public static void writeFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("hello world!");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

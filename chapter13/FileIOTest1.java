package chapter13;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest1 {

    public static void main(String[] args) throws IOException {
        String source = "Have a food day. Have a nice day! Have good? Have fun?";
        char[] intxt = new char[source.length()];
        source.getChars(0, source.length(), intxt, 0);

        FileWriter fw = new FileWriter("temp.txt");
        fw.write(intxt);
        fw.close();
    }

}

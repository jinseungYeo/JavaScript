package chapter13;
import java.io.FileReader;

public class ExceptionTest06 {
    public static void main(String[] args) throws Exception {
        FileReader file = null;
        try {
            file = new FileReader("a.txt");
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);
            }
        } finally {
            if (file != null) {
                file.close();
            }
        }
    }
}
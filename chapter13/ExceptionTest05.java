package chapter13;

public class ExceptionTest05 {
	public static void main(String[] args) {
	try {
		FileReader file = new FileReader("a.txt");
		int i;
		while ((i=file.read()!=-1){
			System.out.print((char)i);
			file.close();
		}
	}catch
}
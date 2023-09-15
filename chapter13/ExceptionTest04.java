package chapter13;

public class ExceptionTest04 {
	public static void main(String[] args) {
		fileReader file= new fileReader("a.txt");
		int i;
		while ((i=file.read())!=-1{
			System.out.print((char)i);
			file.close();
		}
	}
}

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class chararraywriter {
	public static void main(String[] args) throws Exception {
		
		CharArrayWriter caw = new CharArrayWriter();
		
		caw.write("welcome to java point");
		FileWriter f1 = new FileWriter("data1.txt");
		FileWriter f2 = new FileWriter("data2.txt");
		FileWriter f3 = new FileWriter("newfile.txt");
		FileWriter f4 = new FileWriter("f1.txt");
		caw.writeTo(f1);
		caw.writeTo(f2);
		caw.writeTo(f3);
		caw.writeTo(f4);
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		System.out.println("success");
		
		
	}

}

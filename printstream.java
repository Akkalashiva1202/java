import java.io.FileOutputStream;
import java.io.PrintStream;

public class printstream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("new1.java");
		PrintStream po = new PrintStream(fos);
		po.println("class new1");
		po.println("{public static void main(String[] args)");
		po.println("int i=10;");
		po.println("System.out.println(i);}}");
		
		po.println(2016);
		po.println("hello java");
		po.println("welcome to java");
		po.close();
		fos.close();
		System.out.println("successfully completed");

	}

}

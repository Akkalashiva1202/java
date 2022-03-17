import java.io.FileWriter;
import java.io.StringReader;

public class stringreader {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str = "hello java!! \n welcome to javapoint";
		StringReader se = new StringReader(str);
		int k=0;
		while((k=se.read())!=-1) {
			System.out.print((char)k);
			
			FileWriter w = new FileWriter("data1.txt");
			w.write((char)k);
			System.out.println("file written");
		}
		 

	}

}

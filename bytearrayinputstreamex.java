import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class bytearrayinputstreamex {

	public static void main(String[] args) throws Exception {
		int a=65;
		char c = (char)a;
		System.out.println("Ascii of 65 is :"+c);
		// TODO Auto-generated method stub
		byte[] b = { 35, 36, 37, 38 };
		System.out.println("create the newbyte array input stream");
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
	/*	FileOutputStream fos = new FileOutputStream("first.txt");
		fos.write(b);
		FileInputStream fis = new FileInputStream("first.txt");
		int i=0;
		System.out.println("converting of a byte into character");
		while((i=fis.read())!=-1) {
			char ch = (char)i;
			System.out.println("ASCII value of character is :"+i +"special character");
		}
		*/int i=0;
		while((i=bin.read())!=-1) {
			char ch = (char)i;
			  System.out.println("ASCII value of Character is:" + i + "; Special character is: " + ch);  

			
		}
		
	}

}

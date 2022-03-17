import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileinputstreamex {
	public static void main(String[] args) {
		System.out.println("reading single character");
		try {
		FileInputStream fin = new  FileInputStream("C:\\ex\\News.java");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
		
		}catch(Exception e) {System.out.println(e);}
		System.out.println("reading all characters");
		try {
			FileInputStream fi = new FileInputStream("C:\\ex\\News.java");
			int i=0;
			while((i=fi.read())!=-1) {
				System.out.print((char)i);
			}
			fi.close();
		}catch(Exception e) {System.out.println(e);
		
		
	}
	}

}

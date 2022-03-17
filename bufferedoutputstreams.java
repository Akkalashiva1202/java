import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.util.Scanner;

public class bufferedoutputstreams {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("data2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//Scanner sc = new Scanner(fos);
		String s = "hai my name is shiva ji";
	/*	char[] ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i] = s.charAt(i);
			
		}
		for(char c:ch) {
			System.out.print(c);
		}
		*/
		byte[] b =s.getBytes();
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println(" \n successfully completed");

	}

}

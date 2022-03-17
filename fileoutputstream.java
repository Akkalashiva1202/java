import java.io.FileOutputStream;
import java.util.Arrays;

public class fileoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("data.txt");
			fos.write(65);
			fos.close();
			System.out.println("success");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("example 2 String");
		try {
			FileOutputStream fs = new FileOutputStream("data1.txt");
			String s = "this is java programming language and this is first learning language";
		//	byte[] b =s.getBytes();
			//converting String to bytes array
		/*
			int[] arr = new int[s.length()];
			for(int i=0;i<s.length();i++)
			 {
				 arr[i] = Integer.parseInt(s);
			 }
			System.out.println(Arrays.toString(arr));
			*/
			///fs.write(b);
			char[] ch =new char[s.length()];
			for(int i=0;i<s.length();i++)
			{
				ch[i] = s.charAt(i);
			}
			for(char c:ch) {
				System.out.print(c);
			fs.write(c);
			}
			fs.close();
		
		}
		catch(Exception e) {System.out.println(e);}

	}

}

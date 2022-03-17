import java.io.CharArrayReader;

public class chararrayreaderex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		char[] arr = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };  
		CharArrayReader car = new CharArrayReader(arr);
		int k;
		while((k=car.read())!=-1) {
			char ch = (char)k;
			System.out.println(ch+":");
			System.out.println(k);
		}
	}

}

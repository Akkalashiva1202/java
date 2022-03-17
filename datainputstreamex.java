import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

public class datainputstreamex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("newfile.txt");
		DataInputStream din = new DataInputStream(in);
		
		int count = in.available();
		byte[] arr = new byte[count];
		din.read(arr);
		for(byte b:arr)
		{
			char c =(char)b;
			System.out.print(c+"-");
		}
	}

}

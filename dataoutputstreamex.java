import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class dataoutputstreamex {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("dataoutputstream.txt");
		DataOutputStream data = new DataOutputStream(fos);
		String s= "shiva";
		byte[] b=s.getBytes();
	//	int i = Integer.parseInt(s);
		//System.out.println(i);
		data.write(65);
		data.write(b);
		data.flush();
		data.close();
		System.out.println("success");
	}

}

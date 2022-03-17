import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class bytearrayoutputstreamex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("writing same data to multiple files using bytearrayoutput stream");
		FileOutputStream fos1 = new FileOutputStream("f1.txt");
		FileOutputStream fos2 = new FileOutputStream("f2.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String s = "shiva ji";
		//int i = Integer.parseInt(s);
		byte[] b = s.getBytes();
		bout.write(b);
		 bout.writeTo(fos1);
		 bout.writeTo(fos2);
		 bout.flush();
		 bout.close();
		 System.out.println("success");
		
	}

}

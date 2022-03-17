import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class filteroutputstreamex {
	public static void main(String[] args) throws Exception {
		
		File data = new File("E:\\akkala\\@eclipse-workspace2\\javaIO programs\\data1.txt");
		FileOutputStream fos = new FileOutputStream(data);
		FilterOutputStream fil = new FilterOutputStream(fos);
		String s = "welcome to java programming";
		byte[] b = s.getBytes();
		
		fil.write(b);
		fil.flush();
		fil.close();
		fos.close();
		System.out.println("Successfully completed");
		
	}

}

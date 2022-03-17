import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class filterinputstreamex {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		File f = new File("data2.txt");
		FileInputStream fis = new FileInputStream(f);
		FilterInputStream fil = new BufferedInputStream(fis);
		int i=0;
		while((i=fil.read())!=-1) {
			System.out.println((char)i);
		}
		fil.close();
		fis.close();
		
		
	}

}

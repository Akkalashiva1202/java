import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.StringWriter;

public class stringwriterex {
	public static void main(String[] args) throws Exception{
		char[] arr = new char[512];
		
		StringWriter sw = new StringWriter();
		FileInputStream fis = new FileInputStream("data1.txt");
/*	//	BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
		int x;
		while((x =br.read(arr))!=-1) {
			sw.write(arr,0,x);
		}
		System.out.println(sw.toString());
		sw.close();
		br.close();
	*/
		}
	
	
	

}

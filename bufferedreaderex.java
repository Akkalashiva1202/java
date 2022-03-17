import java.io.BufferedReader;
import java.io.FileReader;

public class bufferedreaderex {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("data2.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}
	}

}

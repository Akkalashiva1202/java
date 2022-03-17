import java.io.BufferedReader;
import java.io.InputStreamReader;

public class consolebyinpsrbuf {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("enter yr name:  ");
		String name = br.readLine();
		System.out.println("welcome : "+name);
		
		
		
	}

}

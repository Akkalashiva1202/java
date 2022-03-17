import java.io.BufferedReader;
import java.io.InputStreamReader;

public class readingdatafromconsole {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String name=" ";
		while( name!="stop") {
			System.out.println("enter data");
			name = br.readLine();
			System.out.println("data is :"+name);
		}
		br.close();
		in.close();
		

	}

}

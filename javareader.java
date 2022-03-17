import java.io.FileReader;
import java.io.Reader;

public class javareader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		Reader r = new FileReader("output.txt");
		int data = r.read();
		while(data!=-1) {
			System.out.print((char)data);
			data =r.read();
			
		}
		r.close();

	}

}

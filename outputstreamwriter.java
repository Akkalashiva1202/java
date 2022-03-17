import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class outputstreamwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			OutputStream os = new FileOutputStream("output1.txt");
			
			Writer w = new OutputStreamWriter(os);
			w.write("hello world");
			w.close();
		
		
		}catch(Exception e) {e.getMessage();
	}

}
}

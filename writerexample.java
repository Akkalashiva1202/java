import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			Writer w = new FileWriter("output.txt");
			String con = "i love java programming";
			w.write(con);
			w.close();
			System.out.println("done");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}

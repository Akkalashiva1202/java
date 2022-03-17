import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferedwriterex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fr = new FileWriter("data1.txt");
		BufferedWriter br = new BufferedWriter(fr);
		br.write("this is buffered writer");
		br.close();
		System.out.println("success");
	}

}
 
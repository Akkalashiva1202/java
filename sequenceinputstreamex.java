import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class sequenceinputstreamex {
	
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("data1.txt");
			FileInputStream f2 = new FileInputStream("data2.txt");
			SequenceInputStream seq = new SequenceInputStream(f1,f2);
			int i;
			while((i=seq.read())!=-1) {
				System.out.print((char)i);
			}
			seq.close();
			f1.close();
			f2.close();
		}
		catch(Exception e) {System.out.println(e);
	}
}
}

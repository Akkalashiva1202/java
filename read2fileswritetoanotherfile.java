import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class read2fileswritetoanotherfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream f1 = new FileInputStream("data1.txt");
		FileInputStream f2 = new FileInputStream("data2.txt");
		FileOutputStream fos = new FileOutputStream("newfile.txt");
		SequenceInputStream seq = new SequenceInputStream(f1,f2);
		int i;
		while((i=seq.read())!=-1) {
			 fos.write(i);
		}
		seq.close();
		fos.close();
		f1.close();
		f2.close();
		System.out.println("successfully completed");
		}
		catch(Exception e) {e.getMessage();

	}

	}
}

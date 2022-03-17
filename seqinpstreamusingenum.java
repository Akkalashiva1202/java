import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class seqinpstreamusingenum {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("data1.txt");
		FileInputStream f2 = new FileInputStream("data2.txt");
		FileInputStream f3 = new FileInputStream("newfile.txt");
		
		Vector v = new Vector();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		System.out.println(v.get(2));
		//creating enumeration object by calling the elements method    
		Enumeration e = v.elements();
		System.out.println(e.nextElement());

		//passing the enumeration object in the constructor
		SequenceInputStream s = new SequenceInputStream(e);
		int i;
		while((i=s.read())!=-1) {
			System.out.print((char)i);
			
		}
		s.close();
		f1.close();
		f2.close();
		f3.close();
		
		
	}

}

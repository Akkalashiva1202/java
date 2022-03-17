import java.io.FileReader;

public class filereaderex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			FileReader fr = new FileReader("data2.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			fr.close();
			} 
	}

}

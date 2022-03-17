import java.io.FileWriter;

public class filewriterex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	try {	FileWriter fw = new FileWriter("data1.txt");
		String s = "welcome to java prgramming";
		fw.write(s);
		fw.close();
	}catch(Exception e) {System.out.println("success");
		
	}

}
}
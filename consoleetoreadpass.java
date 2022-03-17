import java.io.Console;

public class consoleetoreadpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console c = System.console();
		System.out.println("enter pass word");
		char[] ch = c.readPassword();
		System.out.println("converting  char array to string");
		String pass = String.valueOf(ch);
		System.out.println("password is : "+pass);
		
		
		
		
	}

}

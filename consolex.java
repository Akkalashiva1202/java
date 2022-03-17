import java.io.Console;

public class consolex {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub	
		
		Console c = System.console();
		System.out.println("enter your name:");
		String n =c.readLine();
		System.out.println("welcome : "+n);
	}

}

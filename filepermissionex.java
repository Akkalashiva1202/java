import java.io.FilePermission;
import java.security.PermissionCollection;

public class filepermissionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "E:\\akkala\\permissions";
		FilePermission fp = new FilePermission("E:\\akkala\\permissions\\-" , "read");
		PermissionCollection p = fp.newPermissionCollection();
		p.add(fp);
		FilePermission fp2 = new FilePermission(str, "write");
		p.add(fp2);
		if(p.implies(new FilePermission(str, "read,write")))
		{
			System.out.println("read,write permission is granted for the path"+str);
		}
		else {
			System.out.println("No Read, Write permission is granted for the path ");
		}
		
		
		
	}

}

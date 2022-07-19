package Practice2;

class Pub_accmod{
	public void disp(){
		System.out.println("This is Public access specifier");
	}
}
public class AccessSpecifierPublic {
	public static void main(String args[]) {
		Pub_accmod def = new Pub_accmod();
		def.disp();
	}
}


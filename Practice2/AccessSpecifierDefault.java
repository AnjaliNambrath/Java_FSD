package Practice2;

class Def_accmod{
	void disp(){
		System.out.println("This is default access specifier");
	}
}
public class AccessSpecifierDefault {
	public static void main(String args[]) {
		Def_accmod def = new Def_accmod();
		def.disp();
	}
}

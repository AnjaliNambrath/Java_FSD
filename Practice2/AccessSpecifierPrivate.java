package Practice2;

class Pri_accmod{
	private void disp(){
		System.out.println("This is Private access specifier");
	}
}
public class AccessSpecifierPrivate {

	public static void main(String[] args) {
		//Pri_accmod def = new Pri_accmod();
		//Compile time error
		//Since disp has a private access
		//def.disp();

	}

}

package Practice2;

class Pro_accmod {
    // protected method
    protected void display() {
        System.out.println("This is protected access modifier");
    }
}
public class AccessSpecifierProtect extends Pro_accmod{

	public static void main(String[] args) {
		AccessSpecifierProtect def = new AccessSpecifierProtect();
		def.display();

	}

}

package Practice18;
class Addition{
	public int add(int x,int y) {
		return x+y;
	}
	public int add(int x,int y,int z) {
		return x+y+z;
	}
	public double add(double x,double y) {
		return x+y;
	}
}
public class CompiletimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ob1 = new Addition();
		System.out.println(ob1.add(21,23));
		Addition ob2 = new Addition();
		System.out.println(ob2.add(21,33,67));
		Addition ob3 = new Addition();
		System.out.println(ob3.add(7.5, 6.9));
	}

}

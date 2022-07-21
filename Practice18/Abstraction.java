package Practice18;
interface Team1{
	public int add(int x,int y);
}
interface Team2{
	public int sub(int x,int y);
}
class Manager implements Team1,Team2{
	public int add(int x,int y) {
		return x+y;
	}
	public int sub(int x,int y) {
		return x-y;
	}
	public void Ownmethod() {
		System.out.println("Manager own method");
	}
}
public class Abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager();
		System.out.println(mg.add(1, 2));
		System.out.println(mg.sub(12,10));
		Team1 t1 = new Manager();
		System.out.println("Team 1:"+t1.add(1, 2));
		Team2 t2 = new Manager();
		System.out.println("Team 2:"+t2.sub(12, 3));
	}

}

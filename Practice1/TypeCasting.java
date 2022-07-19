package Practice1;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("TYPE CASTING\n");
		System.out.println("Implicit Type Casting");
		int i=10;
		System.out.println("Before Implicit Type Casting\n" +i);
		//implicitconversion
		float f=i; 
		System.out.println("After Implicit Type Casting\n" +f);
		char c='A';
		System.out.println("Before Implicit Type Casting\n" +c);
		//implicitconversion
		int j=c; 
		System.out.println("After Implicit Type Casting\n" +j);
		System.out.println("Explicit Type Casting");
		double d=10.5;
		System.out.println("Before explicit Type Casting\n" +d);
		//explicitconversion
		int q=(int)d; 
		System.out.println("After explicit Type Casting\n" +q);

	}

}

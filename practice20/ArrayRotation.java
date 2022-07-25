package practice20;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array\n");
		n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements\n");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(int i=1;i<=5;i++) {
			x = a[n-1];
			for(int j=n-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=x;
			
		}
		System.out.println("After Rotation\n");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}

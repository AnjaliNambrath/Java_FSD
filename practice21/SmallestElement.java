package practice21;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x=4;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array\n");
		n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements\n");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Fourth Smallest Element is:"+a[x-1]);
	}

}

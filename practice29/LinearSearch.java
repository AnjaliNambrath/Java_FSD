package practice29;

import java.util.Scanner;

public class LinearSearch {
	public static int SearchElement(int[] a,int k) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		n=in.nextInt();
		int a[]= new int[n];
		System.out.println(("Enter elements:"));
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int k;
		System.out.println("Enter the element to search");
		k=in.nextInt();
		System.out.println("Element found at "+SearchElement(a,k)+"th position");
		if(SearchElement(a, k)==-1) {
			System.out.println("Element Not Found");
		}
	}

}

package practice30;

import java.util.Scanner;

public class BinarySearch {
	public static int SearchElement(int[]a,int l,int r,int k) {
		int mid;
		if(r>=l) {
			mid=l+(r-l)/2;
			if(a[mid]==k) {
				return mid;
			}
			if(a[mid]>k) {
				return SearchElement(a,l,mid-1,k);
			}
			else {
				return SearchElement(a,mid+1,r,k);
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
		System.out.println("Element found at index position "+SearchElement(a,0,n-1,k));
		if(SearchElement(a,0,n-1, k)==-1) {
			System.out.println("Element Not Found");
		}
	}

}

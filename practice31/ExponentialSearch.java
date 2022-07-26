package practice31;

import java.util.Scanner;

public class ExponentialSearch {
		public static int BinarySearch(int[]a,int l,int r,int k) {
			int mid;
			if(r>=l) {
				mid=l+(r-l)/2;
				if(a[mid]==k) {
					return mid;
				}
				if(a[mid]>k) {
					return BinarySearch(a,l,mid-1,k);
				}
				else {
					return BinarySearch(a,mid+1,r,k);
				}
			}
			return -1;
		}
		public static int SearchElement(int arr[], int n, int x)
		{
		    if (arr[0] == x)
		        return 0;
		    int i = 1;
		    while (i < n && arr[i] <= x)
		        i = i*2;
		    return BinarySearch(arr, i/2, Math.min(i, n-1), x);
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
		System.out.println("Element found at index position "+SearchElement(a,n,k));
		if(SearchElement(a,n,k)==-1) {
			System.out.println("Element Not Found");
		}
	}

}

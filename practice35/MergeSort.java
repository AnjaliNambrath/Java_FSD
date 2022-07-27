package practice35;

import java.util.Scanner;

public class MergeSort {
	void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
	void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=in.nextInt();
		int a[]= new int[n];
		System.out.println(("Enter elements:"));
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Before Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
		MergeSort ob = new MergeSort();
        ob.sort(a, 0, n-1);
        System.out.println("\nAfter Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
	}

}

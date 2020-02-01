package pro2633;

import java.util.Scanner;

public class Main {

	public static int binarySearch(int start, int end, int arr[], int k) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			if((mid==0 || k>arr[mid-1]) && k<=arr[mid]) {
				return mid+1;
			}
			else if (k<=arr[mid-1]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return arr.length+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(binarySearch(0,n-1,arr,k));
		
		
	}

}

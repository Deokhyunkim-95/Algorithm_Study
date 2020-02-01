package pro3002;

import java.util.Scanner;

public class Main {

	public static int binarySearch(int start, int end, int arr[], int k) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(k==arr[mid]) {
				return mid+1;
			}
			else if (k<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0; i<n; i++) {
			num[i]=s.nextInt();
		}
		int m=s.nextInt();
		int question[]=new int[m];
		for(int i=0; i<m; i++) {
			question[i]=s.nextInt();
		}
		for(int i=0; i<m; i++) {
			System.out.print(binarySearch(0,n-1,num,question[i])+" ");
		}
		
	}

}

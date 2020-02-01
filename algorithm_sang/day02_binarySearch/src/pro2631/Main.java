package pro2631;

import java.util.Scanner;

public class Main {

	public static int treasure(int arr[], int k) {
		int count = 0;
		int n = arr.length;
		int sum = 0;
		int j = 0;
		for (int i = 0; i < n;) {
			if (sum == k) {
				System.out.println(i+" "+(j-1));
				count++;
				sum -= arr[i++];
			} else if (sum > k) {
				sum -= arr[i++];
			} else {				
				sum += arr[j++];
			}
			if (j==n){
				if(sum==k) {
					count++;
				}
				break;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int count = treasure(arr, k);
		System.out.println(count);
	}

}

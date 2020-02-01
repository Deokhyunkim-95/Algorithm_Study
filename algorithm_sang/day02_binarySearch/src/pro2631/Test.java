package pro2631;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		while(true) {
			
		int start=s.nextInt();
		int end=s.nextInt();
		int sum=0;
		for(int i=start; i<=end; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		}
	}

}

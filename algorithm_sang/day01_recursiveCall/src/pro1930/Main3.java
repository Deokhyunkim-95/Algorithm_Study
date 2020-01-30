package pro1930;

import java.util.Scanner;

public class Main3 {

	static int arr[][]=new int[20][20];
	public static int superSum3(int k, int n) {
		if(arr[k][n]!=0) {
			return arr[k][n];
		}
		else if (k == 0) {
			arr[k][n]=n;
			return n;
		}
		else {
			for(int i=1; i<=n; i++) {
				arr[k][n]+=superSum3(k-1,i);
			}
			return arr[k][n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int k = s.nextInt();
			int n = s.nextInt();
			System.out.println(superSum3(k, n));

		}
	}

}

package pro1930;

import java.util.Scanner;

public class Main2 {

	public static int superSum(int k, int n) {
		if (k == 0)
			return n;
		else {
			int sum=0;
			for(int i=1; i<=n; i++) {
				sum+=superSum(k-1,i);
			}
			return sum;
		}
	}
	
	public static int superSum2(int k, int n) {
		if (k == 0)
			return n;
		else if(n==1)
			return 1;
		else {
			return superSum2(k,n-1)+superSum2(k-1,n);
		}
	}
	
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
			long start = System.currentTimeMillis();
			System.out.println(superSum(k, n));
			long end = System.currentTimeMillis();
			System.out.println( "规过1 角青 矫埃 : " + ( end - start )/1000.0 );
			start = System.currentTimeMillis();
			System.out.println(superSum2(k, n));
			end = System.currentTimeMillis();
			System.out.println( "规过2 角青 矫埃 : " + ( end - start )/1000.0 );
			start = System.currentTimeMillis();
			System.out.println(superSum3(k, n));
			end = System.currentTimeMillis();
			System.out.println( "规过3 角青 矫埃 : " + ( end - start )/1000.0 );

		}
	}

}

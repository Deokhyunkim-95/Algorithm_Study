package pro1930;

import java.util.Scanner;

public class Main {
	public static int superSum(int k, int n) {
		if (k == 0)
			return n;
		else if(n==1)
			return 1;
		else {
			return superSum(k,n-1)+superSum(k-1,n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (s.nextInt()==-1) {
			int k = s.nextInt();
			int n = s.nextInt();
			System.out.println(superSum(k, n));
		}
	}

}

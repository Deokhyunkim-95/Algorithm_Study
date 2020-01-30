package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1928 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		Collatz c = new Collatz();
		//c.collatz(5);
		c.collatz(a);
		
	}
}

class Collatz{
	public int collatz(int n) {
		if(n==1);
		else if(n % 2 == 1) {
			//System.out.println(n);
			collatz(3*n+1);
		}else {
			collatz(n/2);
			//System.out.println(n);
			//if(n/2 != 1)collatz(n/2);; 
			//if(n/2 == 1) System.out.println(1);
		}
		System.out.println(n);
		return 0;
	}
}
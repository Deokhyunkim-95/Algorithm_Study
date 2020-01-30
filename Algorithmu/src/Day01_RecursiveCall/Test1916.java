package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1916 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Fibonacci f = new Fibonacci();
		//System.out.println(f.fibonacci(7) %10009);	
		System.out.println(f.fibonacci(n) %10009);	
		//10009 를 나누는 이유는, 64bit 넘어가는 수를 계산하기 때문. 10009는 소수.
	}
}

class Fibonacci{
	public int fibonacci(int n) {
		if (n<=1) {
			return n;
		}else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
}
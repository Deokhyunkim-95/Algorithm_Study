package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1904 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		OddNumber odd = new OddNumber();
		odd.oddNumber(a,b);	
	}
}

class OddNumber {
	public int oddNumber(int a, int b) {
		if((2*a-1)<=b) {
			System.out.print(2*a - 1+" ");
			oddNumber(a+1,b);
			return 0;			
		}if (a>0) {
			return 0;
		}if (b>100) {
			return 0;
		}
		return 0;			
	}
}
package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1905 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		SumNumber s = new SumNumber();
		//System.out.println(s.sumNumber(10));
		System.out.println(s.sumNumber(i));
	}
}

class SumNumber{
	public int sumNumber(int n) {
		if(n>=1) {
			int result = n+sumNumber(n-1);
			return result;
		} 
		return 0;
	}
}
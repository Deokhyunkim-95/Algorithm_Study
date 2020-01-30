package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1902 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		RecursiveCall r = new RecursiveCall();
		r.recursiveReverse(i);
	}
}

class RecursiveCall{
	public int recursiveReverse(int n){
		if(n>200) {
			return 0;
		}else if(n<=0) {
			return 0;
		}else if(n>=1) {
			System.out.println(n);
			recursiveReverse(n-1);			
		}
		return 0;
	}
}
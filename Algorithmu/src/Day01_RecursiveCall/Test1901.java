package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1901 {
	public static void main(String[] args) {
//		메서드 내에서 자신의 메서드와 같은 형태의 메서드를 반복적으로 호출
//		재귀호출(Recursive Call)이란 메서드 내에서 자기 자신을 반복 호출
//		재귀함수 형태로 많이 사용됨.
//		예: 팩토리얼(Factorial) -1912번 문제
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		RecursiveReverse r = new RecursiveReverse();
		r.recursiveReverse(i);
	}
}

class RecursiveReverse{
	public int recursiveReverse(int n){
		if(n>200) {
			return 0;
		}else if(n<=0) {
			return 0;
		}else if(n>=1) {
			recursiveReverse(n-1);			
			System.out.println(n);
		}
		return 0;
	}
}
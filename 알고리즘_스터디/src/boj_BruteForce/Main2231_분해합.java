package boj_BruteForce;

import java.util.Scanner;

public class Main2231_분해합 {
	/*
	 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
	 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
	 * 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 
	 * 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 
	 * 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
	 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		
		//자릿수 구하기
		int log = (int)(Math.log10(N)+1);
		
		
		//시작수 구하기
		int start = N - log*9;
		System.out.println(start);
		
		//시작수~N까지 분해합 구하기
		int num = 0;	//생성자
		
		for (int i=start; i<N; i++) {
			
			int n = sum(i);
			if(i+n == N) {
				num = i;
				break;
			}
			
		
		}
		System.out.println(num);
		

	}
	
	public static int sum(int N) {
		int sum = 0;
		while (N>0) {
			sum += N%10;
		}
		return sum;
	}

}

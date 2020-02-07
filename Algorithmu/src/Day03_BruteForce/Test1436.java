package Day03_BruteForce;

import java.util.Scanner;

public class Test1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int array[] = new int[10000];
		
		for(int i = 0 ; i<n; i++) {
			array[i] = 666 + i * 1000;
		}
		System.out.println(array[n-1]);
	}
}

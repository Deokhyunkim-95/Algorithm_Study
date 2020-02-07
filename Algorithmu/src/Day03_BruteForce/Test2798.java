package Day03_BruteForce;

import java.util.Scanner;

public class Test2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int array[] = new int [n];
		int sum=0;
		
		for(int i = 0 ; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i =0; i<n-2; i++) { 
			for(int j = 1; j<n-1; j++) {
				for(int k= 2; k<n; k++) {
						int x = array[i]+ array[j]+ array[k];
						if(m >= x) {
							sum = Math.max(sum, x);
							
					}
				}
			}
		}
		System.out.println(sum);
	}
}

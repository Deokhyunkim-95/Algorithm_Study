package Day03_BruteForce;

import java.util.Scanner;

public class Test1018 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		String nm[][] = new String [n][m];
		/*
		//W, B 번갈아가면서 출력하는 예시( 0, 1로  대체해서 출력)
		for(int i=0;i<n;i+=2) {
			for(int j=0; j<m; j+=2) {
				nm[i][j] = 0;
				nm[i][j+1] = 1;
			}
		}for(int i=1; i<n; i+=2) {
			for(int j=0; j<m; j+=2) {
				nm[i][j] = 1;
				nm[i][j+1] = 0;
			}
		}
			
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(nm[i][j]);
			}
			System.out.println();
		}
		*/
		//그냥 입력하는 예시 1
		for(int i =0 ; i<n; i++) {
			for(int j = 0; j<m; j++) {
				nm[i][j] = scanner.nextLine();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(nm[i][j]);
			}
			System.out.println();
		}		
	}
}

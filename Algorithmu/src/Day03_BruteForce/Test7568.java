package Day03_BruteForce;

import java.util.Scanner;

public class Test7568 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int xy [][] = new int[50][2];
		int count [] = new int[n];
		
		
		for(int x = 0; x< n; x++) {
			for(int y = 0; y<=1; y++) {
				xy[x][y] = scanner.nextInt();
			}
		}
		
		for(int j =0; j<n; j++) {
			int result  = 0;
			for(int i = 0; i< n ;i++) {
				if(xy[j][0] <= xy[i][0] && xy[j][1] <= xy[i][1]) {
					count[j] = result++;
				}
			}
			System.out.print(count[j]+1+ " ");
		}
	}

}

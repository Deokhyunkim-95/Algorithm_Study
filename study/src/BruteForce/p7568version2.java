package BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class p7568version2 {

	public static void main(String[] args) {

//		int w[] = null;
//		int h[] = null;
//		int result[] = null;

		int result[][];
		int rank[];
		int a;

		Scanner people = new Scanner(System.in);

		// »ç¶÷¼ö
		a = people.nextInt();

		result = new int[a][2];
		rank = new int[a];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 2; j++) {

				int w = people.nextInt();

				result[i][j] = w;

			}

		}

		for (int i = 0; i < a-1; i++) {
			for (int j = 0; j < a; j++) {

				if (result[i][0] > result[j][0] && result[i][1] > result[j][1]) {
					rank[j]++;
				}
			}
		}
		
		for(int i=0;i<a;i++) {
			System.out.println((rank[i]+1)+ "");
		}
	}

}

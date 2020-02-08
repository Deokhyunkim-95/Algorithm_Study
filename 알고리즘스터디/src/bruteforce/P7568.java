package bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] num = new int[n][2];
		int[] rank = new int[n];

		for (int i = 0; i < n; i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
			rank[i] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (num[i][0] > num[j][0] && num[i][1] > num[j][1]) {
					rank[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
	}
}

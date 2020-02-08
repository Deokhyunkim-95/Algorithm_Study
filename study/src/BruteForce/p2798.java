package BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class p2798 {

	public static void main(String[] args) {

		int N;
		int M;
		int[] a;

		int sum = 0;
		int sum1 = 0;

		Scanner input = new Scanner(System.in);

		N = input.nextInt();
		M = input.nextInt();

		a = new int[N];

		for (int i = 0; i < N; i++) {

			int b = input.nextInt();

			a[i] = b;

		}

		a : for (int x = 0; x < N - 2; x++) {
			for (int y = x + 1; y < N - 1; y++) {
				for (int z = y + 1; z < N; z++) {

					sum1 = a[x] + a[y] + a[z];

					if (sum1 <= M) {
						
						sum = Math.max(sum, sum1);

					}

					else if (sum == M) {
						break a;
					}

				}
			}
		}

		System.out.println(sum);

	}
}

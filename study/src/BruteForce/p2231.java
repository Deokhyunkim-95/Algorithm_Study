package BruteForce;

import java.util.Scanner;

public class p2231 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int result = 0;
		int ans = 0;

		Scanner input = new Scanner(System.in);

		a = input.nextInt();

		if (a >= 1 && a <= 1000000) {
			b = String.valueOf(a).length();

			result = a - (b * 9);

			for (int i = result; i < a; i++) {
				int sum = i;
				int k = i;

				while (k > 0) {
					sum = sum + k % 10;
					k = k / 10;
				}

				if (sum == a) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);

		}

		else {
			System.out.println("ÀÔ·Â °ªÀÌ ¹ş¾î³³´Ï´Ù.");
		}
	}

}

package bruteforce;

import java.util.Scanner;

public class P2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int l = Integer.toString(sum).length();
		int min = sum - 9 * l;
		for (int i = min; i < sum; i++) {
			int num = i;
			int j = i;
			while (j > 0) {
				int k = j % 10;
				num += k;
				j = j / 10;
			}
				if (num == sum) {
					System.out.println(i);
					break;
				}
			
		}
	}
}

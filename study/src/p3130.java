import java.util.Arrays;
import java.util.Scanner;

public class p3130 {

	public static void main(String[] args) {

		int N = 0;
		int[] hi;
		int sum = 0;

		Scanner input = new Scanner(System.in);

		N = input.nextInt();

		hi = new int[N];

		for (int i = 0; i <= N - 1; i++) {

			Scanner input1 = new Scanner(System.in);

			int a = input1.nextInt();

			hi[i] = a;

		}

		for (int i = 0 ; i < N ; i++) {

			for (int j = i + 1 ; j < N ; j++) {

				if (hi[i] > hi[j]) {

					System.out.println(hi[i]+":test:"+hi[j]);
					sum = sum + 1;
				}

				else {
					break;
				}
			}

		}

		System.out.println(sum);

	}

}

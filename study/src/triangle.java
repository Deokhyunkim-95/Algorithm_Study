import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		tri(1, 1, num);

	}

	private static void tri(int start, int flag, int num) {

		System.out.print("*");

		if (start < num) {

			if (start == flag) {

				System.out.println("");
				tri(1, flag + 1, num);

			}

			else {
				tri(start + 1, flag, num);
			}
		}

	}
}

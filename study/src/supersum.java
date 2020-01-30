import java.util.Scanner;

public class supersum {

	public static void main(String[] args) {

		int x, y;

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		x = input.nextInt();
		y = input1.nextInt();

		System.out.println(supersumtest(x, y));

	}

	private static int supersumtest(int x, int y) {

		int sum = 0;

		if (x == 0) {
			
			return y;
			
		}

		else {

			while (y != 0) {

				sum = sum + supersumtest(x - 1, y--);
				
			}
			
			return sum;

		}

	}

}

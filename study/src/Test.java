
import java.io.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		test(num);

	}

	private static void test(int num) {

		

			if (num == 1) {
				System.exit(1);
			}

			else if (num % 2 == 0) {
				num = num / 2;
			}

			else if (num % 2 == 1) {
				num = num * 3 + 1;
			}

			System.out.println(num);

			test(num);
		

	}
	
	private static void reverse(int num) {
		

		if (num == 1) {
			
		}

		else if (num % 2 == 0) {
			test( num / 2);
		}

		else if (num % 2 == 1) {
			test( num * 3 + 1);
		}

		System.out.println(num);
		
		
	}
}

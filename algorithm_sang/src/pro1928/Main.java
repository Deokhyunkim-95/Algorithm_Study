package pro1928;

import java.util.Scanner;

public class Main {

	public static int num(int n) {
		System.out.println(n);
		if (n == 1)
			return 0;
		if (n % 2 == 1) {
			return num(3 * n + 1);
		} else
			return num(n / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		num(s.nextInt());
	}

}

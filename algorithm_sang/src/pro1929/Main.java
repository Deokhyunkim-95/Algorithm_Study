package pro1929;

import java.util.Scanner;

public class Main {

	public static void num(int n) {
		if (n == 1);
		else if (n % 2 == 1) {
			num(3 * n + 1);
		} else
			num(n / 2);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		num(s.nextInt());
	}

}

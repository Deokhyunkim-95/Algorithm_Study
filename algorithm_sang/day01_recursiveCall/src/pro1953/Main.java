package pro1953;

import java.util.Scanner;

public class Main {
	
	public static String triPrint(int n) {
		if(n>0) {
			String row=triPrint(n-1);
			System.out.println(row);
			return row+"*";
		}
		else return "*";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		triPrint(s.nextInt());
	}

}

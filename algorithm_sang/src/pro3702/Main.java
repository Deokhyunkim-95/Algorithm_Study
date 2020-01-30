package pro3702;

import java.util.Scanner;

public class Main {

	static long arr[][]=new long[51][51];
	public static long pascal(int r, int c) {
		if (arr[r][c]!=0) {
			return arr[r][c];
		}
		else if(c==1 || r==1) {
			return arr[r][c]=1;
		}else {
			return arr[r][c]=(pascal(r,c-1)%100000000+pascal(r-1,c)%100000000)%100000000;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		System.out.println(pascal(r,c));
	}

}

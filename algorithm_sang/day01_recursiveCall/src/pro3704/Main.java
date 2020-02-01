package pro3704;

import java.util.Scanner;

public class Main {

	static int arr[]=new int[100001];
	public static int stair(int n) {
		
		if(arr[n]!=0) return arr[n];
		switch(n) {
		case 1: return arr[n]=1;
		case 2: return arr[n]=2;
		case 3: return arr[n]=4;
		default: 
		return arr[n]=(stair(n-3)+stair(n-2)+stair(n-1))%1000;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=10000; i<num; i+=10000) {
			stair(i);
		}
		System.out.println(stair(num));
	}

}

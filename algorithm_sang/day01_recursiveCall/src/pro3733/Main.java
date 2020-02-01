package pro3733;

import java.util.Scanner;

public class Main {

	static int arr[]=new int[10000001];
	public static int num(long n, int currNum) {
		if(n<currNum && arr[(int)n]!=0) return arr[currNum]+=arr[(int)n];
		arr[currNum]++;
		if (n == 1)
			return 0;
		if (n % 2 == 1) {
			return num(3 * n + 1, currNum);
		} else
			return num(n / 2, currNum);
	}
	
	public static int findMaxNum(int start, int end) {
		int max=1;
		for(int i=start; i<=end; i++) {
			num(i,i);
			if(arr[max]<arr[i])max=i; 		
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int max=findMaxNum(start,end);
		System.out.println(max+" "+arr[max]);
	}

}

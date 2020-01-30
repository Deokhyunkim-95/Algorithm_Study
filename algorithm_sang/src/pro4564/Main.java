package pro4564;

import java.util.Scanner;

public class Main {

	static int arr[] = new int[302];
	static int scores[][]=new int[302][3];
	public static int maxScore(int n, int flag) {
		if(scores[n][flag]!=0) return scores[n][flag];
		if (arr[n + 3] == 0) {
			if (flag == 2)
				return scores[n][flag]=arr[n + 1] + arr[n + 2];
			else if (flag == 0)
				return scores[n][flag]=arr[n] + arr[n + 2];
			else
				return scores[n][flag]=arr[n] + arr[n + 2] > arr[n + 1] + arr[n + 2] ? arr[n] + arr[n + 2] : arr[n + 1] + arr[n + 2];
		}
		if (flag == 2) {
			return scores[n][flag]=maxScore(n + 1, 0);
		} else if (flag == 0) {
			return scores[n][flag]=arr[n] + maxScore(n + 1, 1);
		} else {
			int a = arr[n] + maxScore(n + 1, flag+1);
			int b = maxScore(n + 1, 0);
			return scores[n][flag]= a > b ? a : b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			arr[i] = s.nextInt();
		}
		int max1=maxScore(1, 0);
		int max2=maxScore(2, 0);
		System.out.println(max1>max2?max1:max2);
	}

}

package Day01_RecursiveCall;

import java.util.Scanner;

public class Step {
	   public static void main(String[] args) {
		   /*
		  System.out.println("===========계단오르기===============");
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int[] score = new int[n];
	      int[] dp = new int[n];
	      for (int i = 0; i < n; i++) {
	         score[i] = sc.nextInt();
	      }
	      dp[0] = score[0];
	      dp[1] = score[0] + score[1];
	      dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);
	      for (int i = 3; i < n; i++) {
	         dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]);
	      }
	      System.out.println(dp[n - 1]);
 */
	      System.out.println("============계단오르기2==============");
	      Scanner sc = new Scanner(System.in);
	      int num= sc.nextInt();
	      int[] count= new int[num+1];
	      count[1]=1;
	      count[2]=2;
	      count[3]=4;
	      for(int i=4;i<num+1;i++) {
	         count[i]=count[i-1]+count[i-2]+count[i-3];
	      }
	      System.out.println(count[num]);
	   }

}

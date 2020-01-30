package Day01_RecursiveCall;

import java.util.Scanner;
import java.util.Stack;

public class rain {
		public static void main(String[] args) {

		   System.out.println("nÀÔ·Â:");
		   Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   
		   Stack<Integer> list = new Stack<Integer>();
		   list.push(n);
		   func(n,list);
		   while(list.empty()==false) {
		      System.out.println(list.pop());
		   }
		}
		   public static int func(int n, Stack<Integer> list) {
		      int a = 0;
		      if (n % 2 == 0) {
		         a = n / 2;
		      } else {
		         a = 3 * n + 1;
		      }
		      System.out.println(a);
		      list.push(a);
		      if (a == 1) {
		         return 0;
		      }
		      return func(a, list);
		   }
		}

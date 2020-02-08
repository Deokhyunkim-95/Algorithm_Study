
import java.util.Scanner;

public class LowerBound {
   private static int LBound(int n, long k, long[] arr) {
      long left = 0;
      long right = n - 1;
      int mid;
      while(left<right){
         mid = (int) ((left + right) / 2);
         if(arr[mid] < k) left = mid + 1;
         else right = mid;
      }
      if(right == n-1) {
         return n;
      }
      return (int) right;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long k = sc.nextLong();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextLong();
      }
      System.out.println(LBound(n, k, arr)+1);
      sc.close();
   }
}
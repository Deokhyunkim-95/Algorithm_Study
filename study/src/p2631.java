import java.util.Scanner;

public class p2631 {

   public static void main(String[] args) {

      int result = 0;
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a = sc.nextInt();
      int[] ar = new int[num];
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
      }
      int sum = 0;
      int count = 0;
      int i = 0;
      int j = 0;
      while (j < ar.length) {

         if (i == ar.length) {
            sum = 0;
            j++;

            i = j;
         }
         if (j == ar.length - 1) {
            break;
         }
         sum += ar[i++];

         if (sum == a) {
            count++;
         }
//         System.out.println(sum);
      }
      System.out.println(count);
   }
}
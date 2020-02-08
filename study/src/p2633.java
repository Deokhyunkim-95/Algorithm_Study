import java.util.Arrays;
import java.util.Scanner;

public class p2633 {

	public static void main(String[] args) {

		int a, b;
		int[] c = null;

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		a = input.nextInt();
		b = input.nextInt();

		c = new int[a];

		for (int i = 0; i <= a - 1; i++) {

			Scanner input2 = new Scanner(System.in);

			int d = input2.nextInt();

			c[i] = d;

		}

		System.out.println(LowerBound(b, c));

	}

	private static int LowerBound(int target, int[] c) {

		int start = 0;

		int end = c.length-1;

		while (start <= end) {

			int mid = (start + end) / 2;

			
			
			if(c[mid] > target) {
				
				end = mid - 1;
				
			}

			else if(c[mid]<target){

				start = mid + 1;

			}
			
			else {

				return mid+1;

			}

		}
		return target+1;
	}

}

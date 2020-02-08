import java.util.Scanner;

public class p3002 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[1000000];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int m = scan.nextInt();
		int b[] = new int[100000];
		for (int j = 0; j < m; j++) {
			b[j] = scan.nextInt();
		}

		for (int j = 0; j < m; j++) {
			System.out.print(binarySearch(0, n - 1, a, b[j]) + " ");
		}
	}

	public static int binarySearch(int start, int end, int a[], int target) {
		// int start = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == target) {
				return mid + 1;
			} else if (a[mid] < target) {
				start = mid + 1;
			} else if (a[mid] > target) {
				end = mid - 1;
			} 
		}
		return -1;
	}
}

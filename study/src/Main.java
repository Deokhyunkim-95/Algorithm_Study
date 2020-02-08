
import java.util.Scanner;

public class Main {

	public static void sort(double arr[][]) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j][0] > arr[j + 1][0]) {
					double temp[] = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static double binarySearch(double arr[][], int start, int end, int p) {
		while (start <= end) {
			int mid = (start + end) / 2;
			int sum = p;
			for (int i = 0; i < mid; i++) {
				sum += arr[i][1];
			}
			if (sum < 1000000 && sum + arr[mid][1] >= 1000000) {
				return arr[mid][0];
			} else if (sum >= 1000000) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();
		double arr[][] = new double[n][2];
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			arr[i][0] = Math.sqrt(x * x + y * y);
			arr[i][1] = s.nextInt();
		}

		sort(arr);
		double required = binarySearch(arr, 0, n - 1, p);
		if (required != -1)
			System.out.println(String.format("%.3f", required));
		else
			System.out.println(-1);
	}

}

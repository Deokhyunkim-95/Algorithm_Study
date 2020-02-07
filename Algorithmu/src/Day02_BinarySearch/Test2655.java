package Day02_BinarySearch;

import java.util.Scanner;

public class Test2655 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		yValue y = new yValue();
		System.out.println(Math.round(y.yvalue(-999, 999, a, b)*1000)/1000.0);
		System.out.println(String.format("%.4f", y.yvalue(-999, 999, a, b)));
	}
}

class yValue{
	public double yvalue(double start, double end, int a, int b) {
		//System.out.println(-1 * b/a);
		while(start<end) {
			double mid = (start+end)/2;
			if(a*mid + b==0) {
				return mid;
			}else if(a*mid + b>0) {
				end = mid;
			}else {
				start = mid;
			}
		}
		return 0;
	}
}
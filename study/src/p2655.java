import java.util.Scanner;

public class p2655 {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(Math.round(binarySearch(-999, 999, a, b)*10000)/10000.0);	
			
		}
		
		public static double binarySearch(double start, double end, double a, double b) {
			
			while(start<end) {
				double mid=(start+end)/2;
				if(a*mid+b==0) {
					return mid;
				}
				else if (a*mid+b>0) {
					end=mid;
				}
				else {
					start=mid;
				}
			}
			return 1000;
		}
	
}


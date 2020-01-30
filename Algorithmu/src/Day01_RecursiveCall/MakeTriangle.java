package recursion;
import java.util.Scanner;

public class MakeTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("삼각형크기 입력: ");
		int n = sc.nextInt();
		dot(0,count,n);
		sc.close();
	}
	
	static void dot(int num,int count,int n) {
		if(count < n) {
			if(num < count) {
				System.out.print("*");
				dot(num+1,count,n);
			}
			else {
				System.out.println("*");
				dot(0,count+1,n);
			}
		}
	}
}

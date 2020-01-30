package recursion;
import java.util.Scanner;

public class Stairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(stair(num)%1000);
		sc.close();
	}
	private static int stair(int n) { 			//��ܿ����� ����Ǽ� ����ϴ� �޼ҵ�
		if(n==1) {
			return 1;
		} else if(n==2) {
			return 1 + stair(1);
		} else if (n==3) {
			return 1 + stair(1) + stair(2);
		} else {
			return stair(n-1) + stair(n-2) + stair(n-3);
		}
	}
}

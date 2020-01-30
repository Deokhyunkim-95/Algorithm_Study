import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		Scanner input1 = new Scanner(System.in);
		
		int r,c;
		
		r = input.nextInt();
		c = input1.nextInt();
		
		System.out.println(pascaltest(r,c));
		
		
	}
	
	private static int pascaltest(int r, int c) {

		
		if(r==1 || c==1) {
			return 1;
		}
		
		
		return pascaltest(r, c-1)+pascaltest(r-1, c);
		
		
		
	}
	
}

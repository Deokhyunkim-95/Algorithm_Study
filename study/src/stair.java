import java.util.Scanner;

public class stair {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		
		System.out.println(stairtest(num));
		
		
	}
	
	
	private static int stairtest(int num) {
		
		if(num==1) {
			
			return 1;
			
		}
		
		
		else if(num==2) {
			
			return stairtest(1)+1;
			
		}
		
		else if(num==3) {
			
			return stairtest(1)+stairtest(2)+1;
			
		}
		
		else {
			
			return stairtest(num-3)+stairtest(num-2)+stairtest(num-1);
			
		}
		
		
	}
}

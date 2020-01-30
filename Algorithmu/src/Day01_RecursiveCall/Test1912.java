package Day01_RecursiveCall;

public class Test1912 {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		int n= 5;
		System.out.println(n+"! = " + f.factorial(n));
	}
}

class Factorial{
	public long factorial(int n) {
		long result = 0;
		if(n==1) {
			return 1;
		}else {
			result = n * factorial(n-1); 
		}
		return result;
	}
}

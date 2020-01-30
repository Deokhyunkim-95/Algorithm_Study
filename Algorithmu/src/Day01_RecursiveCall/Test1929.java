package Day01_RecursiveCall;

import java.util.ArrayList;

public class Test1929 {

	public static void main(String[] args) {
		Collatz1 c = new Collatz1();
		c.collatz(5);
	}
}

class Collatz1{
	public int collatz(int n) {
		ArrayList a = new ArrayList();
		if(n % 2 == 1) {
			a.add(n);
			collatz(3*n+1);
		}if(n % 2 == 0) {
			if(n/2 == 1) a.add(1);
			a.add(n);
			if(n/2 != 1) collatz(n/2);
		}
		a.forEach((c)->{System.out.println(c);});
		return 0;
	}
}
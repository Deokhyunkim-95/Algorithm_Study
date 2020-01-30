package Day01_RecursiveCall;

public class Test1953 {

	public static void main(String[] args) {
		int i = 5;
		Triangle1 t1 = new Triangle1(i);
		t1.triangle1(1); 
	}
}

class Triangle1{
	int total = 0;
	int width = 0;
	Triangle1(int x){
		this.total = x;
	}

	public void triangle1(int n){
		if(n == total+1){
			return;
		}
		if(width != n){
			System.out.print("*");
			width++;
			triangle1(n);
		}else{
			System.out.println();
			n++;
			width = 0;
			triangle1(n);
		}
	}
}


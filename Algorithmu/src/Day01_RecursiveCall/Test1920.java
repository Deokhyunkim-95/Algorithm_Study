package Day01_RecursiveCall;

public class Test1920 {
	public static void main(String[] args) {
		BinaryNum bn = new BinaryNum();
		bn.binaryNum(10);
	}
}

class BinaryNum{
	public void binaryNum(int num) {
		if(num>0) {
			int bin;
			bin = num%2;
			num/=2;
			binaryNum(num);
			System.out.print(bin);
		}
		//return 0;
	}
}
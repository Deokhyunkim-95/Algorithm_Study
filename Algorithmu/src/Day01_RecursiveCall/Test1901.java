package Day01_RecursiveCall;

import java.util.Scanner;

public class Test1901 {
	public static void main(String[] args) {
//		�޼��� ������ �ڽ��� �޼���� ���� ������ �޼��带 �ݺ������� ȣ��
//		���ȣ��(Recursive Call)�̶� �޼��� ������ �ڱ� �ڽ��� �ݺ� ȣ��
//		����Լ� ���·� ���� ����.
//		��: ���丮��(Factorial) -1912�� ����
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		RecursiveReverse r = new RecursiveReverse();
		r.recursiveReverse(i);
	}
}

class RecursiveReverse{
	public int recursiveReverse(int n){
		if(n>200) {
			return 0;
		}else if(n<=0) {
			return 0;
		}else if(n>=1) {
			recursiveReverse(n-1);			
			System.out.println(n);
		}
		return 0;
	}
}
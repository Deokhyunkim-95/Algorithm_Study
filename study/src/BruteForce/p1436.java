package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//���° ���ڸ� ã���� �Է�
//1���� �ϳ��ϳ� ���ϸ� 666�� ���Ե� ���ڸ� -1 �Ѵ�
//ã�� ���ڰ� 0 �̸� �Ǹ� �ش� ���� ���
public class p1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int n = Integer.parseInt(br.readLine());
		
		while(n>0) {
			num++;
			
			String str = Integer.toString(num);
			
			if(str.contains("666")) {
				n--;
			}
		}
		
		System.out.println(num);
		
	}
}

package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//몇번째 숫자를 찾는지 입력
//1부터 하나하나 더하면 666이 포함된 숫자면 -1 한다
//찾는 숫자가 0 이면 되면 해당 숫자 출력
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

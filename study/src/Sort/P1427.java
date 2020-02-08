package Sort;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1427 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		
		char[] b;
		
		b= new char[a.length()];
		
		
		for(int i=0; i<a.length();i++) {
			
			b[i]=a.charAt(i);
		}
		
		Arrays.sort(b);
		
		for(int i = b.length-1 ; i >=0;i--) {
			System.out.print(b[i]);
		}
		
	}
}

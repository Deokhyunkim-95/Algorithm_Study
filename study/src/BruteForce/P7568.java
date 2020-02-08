package BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class P7568 {

	public static void main(String[] args) {

		int w[] = null;
		int h[] = null;
		int result[] =null;
		int a;
		
		Scanner people = new Scanner(System.in);
		
		//»ç¶÷¼ö
		a = people.nextInt();
		
		w= new int[a];
		h= new int[a];
		result = new int[a];
		
		for(int i=0; i<a;i++) {

			w[i]=people.nextInt();
			h[i]=people.nextInt();
			
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(w[i]<w[j] && h[i]<h[j]) {
					result[i]++;
				}
			}
		}
		
		
		for(int i : result) {
			System.out.println((i+1)+" ");
		}
		
		
	}

}

package Day03_BruteForce;

import java.util.Scanner;

public class Test7568 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int xy [][] = new int[n][2];
		
		int result[] = new int [n]; //���� ���
		
		for(int x = 0; x< n; x++) {
			result[x] = 1; //�ʱ� ��� 1
			for(int y = 0; y<=1; y++) {
				xy[x][y] = scanner.nextInt();
			}
		}
		
		for(int j =0; j<n; j++) {
			for(int i = 0; i< n ;i++) {
				if(xy[j][0] > xy[i][0] && xy[j][1] > xy[i][1]) {
					result[i]++; //���� ���� �ش� ������ ũ�� �� ����
				}
			}
		}
		
		for(int i =0; i<n; i++) {
			System.out.print(result[i]+" ");
		}
	}

}

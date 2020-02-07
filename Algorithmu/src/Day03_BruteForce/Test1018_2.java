package Day03_BruteForce;

import java.util.Scanner;

public class Test1018_2 {
	
	static int Max = 50;
	static char [][] Chess = new char[Max][Max];
	
	//char [][] Test = new char[8][8];
	static char[][] White = {
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'}};
	
	static char[][] Black = {
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'},
			{'B','w','B','w','B','w','B','w'},
			{'w','B','w','B','w','B','w','B'}
	};
	
	static int count=0;
	public static int WhiteChess(int y, int x) {
		for(int i = y; i<8+y;i++) {
			for(int j=x; j<8+x; i++) {
				if(Chess[i][j] != White[i-y][j-x]) {
					count++;
				}
			}
		}
		return count;
	}
	public static int BlackChess(int y, int x) {
		for(int i=7; i<8+y;i++) {
			for(int j=x; j<8+x; i++) {
				if(Chess[i][j] != Black[i-y][j-x]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int min = 0;
		
		for(int i=0; i<n; i++) {
			String line = sc.next();
			for(int j=0; j<m; j++) {
				Chess[i][j] = line.charAt(j);
			}
		}
		
		for(int y=0; y<n-7;y++) {
			for(int x=0; x<m-7;x++ ) {
				min = Math.min(WhiteChess(y,x), BlackChess(y,x));
			}
		}
		System.out.println(min);
	}
}

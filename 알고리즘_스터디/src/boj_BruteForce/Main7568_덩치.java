package boj_BruteForce;

import java.util.Scanner;

public class Main7568_덩치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// N = 전체 사람의 수 
		int N = sc.nextInt();
		
		// 2차원 배열 필요 -> size는 5 rows 2 columns
		int[][] size = new int[N][2];
		
		// 각 x,y 를 2차원 배열에 넣기
		for (int i=0; i<N; i++) {
			size[i][0] = sc.nextInt();
			size[i][1] = sc.nextInt();
		}
		
		// 각 인덱스 자리에서 0부터 모든 인덱스랑 비교를 해야하기 때문에 이중 for문
		for (int i=0; i<size.length; i++) {
			
			//등수 초기화
			int rank = 0;
			
			for (int j=0; j<size.length; j++) {
				//i랑 j가 값이 같으면 자신이기 때문에 비교할 필요가 없다
				if (i == j) {
					//쓰루해~
					continue;
				}
				//x,y가 모두 커야 rank++하기
				if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					rank ++;
				}
			}
			//등수는 나보다 큰 사람+1이랬음
			System.out.println(rank+1);
		}
	}
}

package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* <알고리즘 구현 방식>
 1. 스도쿠를 2차원 배열로 입력 받는다.
 2. 입력받은 배열을 2중 for문으로 순회하며 빈칸을 찾는다.
 3. 빈칸을 만나면 유망성을 검사하여 넣을 수 있는 값이 있다면 입력한다.
 4. 넣을 수 있는 값이 없을 땐 백트래킹 기법을 통해 이전 인덱스로 돌아가 다시 값을 입력한다.
 5. 배열을 모두 순회하여 빈칸이 다 채워지면 출력한다.
 
  */






public class baekjoon2580 {
	public static int[][] N = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		for(int i =0; i<9; i++) {			//스도쿠 값을 입력 받는다.
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line," ");
			for(int j =0; j<9; j++) {
				N[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		
		sudoku(0,0);	// 인덱스 [0,0] 부터 순회 시작

	}
	
	public static void sudoku(int r, int c) {
		if(c == 9) {		// 9번째 열까지 모두 탐색하면 아래 행을 다시 첫열부터 탐색.
			sudoku(r+1,0);
			return;
		}
		
		
		if(r == 9) {	//9번째 행까지 탐색을 완료하면 결과 값을 출력
			for(int i =0; i<9; i++) {
				for(int j =0; j<9; j++) {
					System.out.printf(N[i][j]+" ");
				}
				System.out.printf("\n");
			}
//			System.exit(0);
			return;
		}
		
		if(N[r][c] == 0) {		// 빈칸을 만났을 때 적합한 값을 넣도록 한다.
			for(int i = 1; i<10; i++) { // 빈칸에 1~9 까지의 값을 대입해보며 적합한 값을 검증한다.
				if(Possible(r,c,i)) {	
					N[r][c] = i;	//넣을 수 있는 값이 있다면 입력하고 
					sudoku(r,c+1);	// 다음 인덱스로 넘어간다.
				}
			}
			N[r][c] = 0;	//적합한 값이 없다면 실패한 대입이므로 해당 가지는
			return;			// return을 통해 파기한다. 
		}
		sudoku(r,c+1); // 해당 인덱스가 빈칸이 아니면 다음 인덱스로 넘어간다.
	
		
	}
	public static boolean Possible(int r, int c, int value) {
		
		//열에서 겹치는 값이 있는지?
		for(int i = 0 ; i<9; i++) {
			if(N[r][i]==value) return false;
		}
		
		//행에서 겹치는 값이 있는지?
		for(int i = 0 ; i<9; i++) {
			if(N[i][c]==value) return false;
		}
		
		// 블록의 기준이 되는 왼쪽 상단 인덱스 찾기
		int block_row = r/3*3;	
		int block_col = c/3*3;
		
		//블록에서 겹치는 값이 있는지?
		for(int i = block_row ; i<block_row+3; i++) {
			for(int j = block_col ; j<block_col+3; j++) {
				if(N[i][j]==value) return false;
			}
		}
		
		
		
		return true;
		

	}
	

}

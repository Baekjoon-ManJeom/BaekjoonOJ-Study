package week8;

import java.util.Scanner;

public class ColoredPaper {
	
	public static int white = 0;
	public static int blue = 0;
	public static int[][] arr;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);

		in.close();
	}

	public static void partition(int row, int col, int size) {

		if(colorCheck(row, col, size)) { //컬러가 같은지 체크
			if(arr[row][col] == 0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}
		
		int newSize = size / 2;	//절반 나누기
		
		partition(row, col + newSize, newSize);				//1사분면
		partition(row, col, newSize);						//2사분면
		partition(row + newSize, col, newSize);				//3사분면
		partition(row + newSize, col + newSize, newSize);	//4사분면
	}
	
	
		public static boolean colorCheck(int row, int col, int size) {
		
			int color = arr[row][col];
			
			for(int i = row; i < row + size; i++) {
				for(int j = col; j < col + size; j++) {
					//색이 같이 않다면 false 리턴 
					if(arr[i][j] != color) {
						return false;
					}
				}
			}

			return true;
		}

}

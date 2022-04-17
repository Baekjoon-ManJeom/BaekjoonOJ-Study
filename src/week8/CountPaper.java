package week8;

import java.util.Scanner;

public class CountPaper {
 
	public static int[][] board;
	public static int minus = 0; //-1
	public static int zero = 0; //0
	public static int one = 0; //1
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		board = new int[N][N];
 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = in.nextInt();
			}
		}
 
		partition(0, 0, N);
 
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);

		in.close();
	}
 
	
	public static void partition(int row, int col, int size) {
 
		if (colorCheck(row, col, size)) {
			if(board[row][col] == -1) { 
				minus++;
			}
			else if(board[row][col] == 0) {
				zero++;
			}
			else {
				one++;
			}
 
			return;
		}
 
		int newSize = size / 3;
		
		partition(row, col, newSize);								// ���� ��
		partition(row, col + newSize, newSize);						// �߾� ��
		partition(row, col + 2 * newSize, newSize);					// ������ ��
		
		partition(row + newSize, col, newSize);						// ���� �߰�
		partition(row + newSize, col + newSize, newSize);			// �߾� �߰�
		partition(row + newSize, col + 2 * newSize, newSize);		// ������ �߰�
		
		partition(row + 2 * newSize, col, newSize);					// ���� �Ʒ�
		partition(row + 2 * newSize, col + newSize, newSize);		// �߾� �Ʒ�
		partition(row + 2 * newSize, col + 2 * newSize, newSize);	// ������ �Ʒ�
 
	}
 
	public static boolean colorCheck(int row, int col, int size) {
		int color = board[row][col];

		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (color != board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
 
}
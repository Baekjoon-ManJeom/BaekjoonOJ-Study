package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* <�˰��� ���� ���>
 1. ������ 2���� �迭�� �Է� �޴´�.
 2. �Է¹��� �迭�� 2�� for������ ��ȸ�ϸ� ��ĭ�� ã�´�.
 3. ��ĭ�� ������ �������� �˻��Ͽ� ���� �� �ִ� ���� �ִٸ� �Է��Ѵ�.
 4. ���� �� �ִ� ���� ���� �� ��Ʈ��ŷ ����� ���� ���� �ε����� ���ư� �ٽ� ���� �Է��Ѵ�.
 5. �迭�� ��� ��ȸ�Ͽ� ��ĭ�� �� ä������ ����Ѵ�.
 
  */






public class baekjoon2580 {
	public static int[][] N = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		for(int i =0; i<9; i++) {			//������ ���� �Է� �޴´�.
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line," ");
			for(int j =0; j<9; j++) {
				N[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		
		sudoku(0,0);	// �ε��� [0,0] ���� ��ȸ ����

	}
	
	public static void sudoku(int r, int c) {
		if(c == 9) {		// 9��° ������ ��� Ž���ϸ� �Ʒ� ���� �ٽ� ù������ Ž��.
			sudoku(r+1,0);
			return;
		}
		
		
		if(r == 9) {	//9��° ����� Ž���� �Ϸ��ϸ� ��� ���� ���
			for(int i =0; i<9; i++) {
				for(int j =0; j<9; j++) {
					System.out.printf(N[i][j]+" ");
				}
				System.out.printf("\n");
			}
//			System.exit(0);
			return;
		}
		
		if(N[r][c] == 0) {		// ��ĭ�� ������ �� ������ ���� �ֵ��� �Ѵ�.
			for(int i = 1; i<10; i++) { // ��ĭ�� 1~9 ������ ���� �����غ��� ������ ���� �����Ѵ�.
				if(Possible(r,c,i)) {	
					N[r][c] = i;	//���� �� �ִ� ���� �ִٸ� �Է��ϰ� 
					sudoku(r,c+1);	// ���� �ε����� �Ѿ��.
				}
			}
			N[r][c] = 0;	//������ ���� ���ٸ� ������ �����̹Ƿ� �ش� ������
			return;			// return�� ���� �ı��Ѵ�. 
		}
		sudoku(r,c+1); // �ش� �ε����� ��ĭ�� �ƴϸ� ���� �ε����� �Ѿ��.
	
		
	}
	public static boolean Possible(int r, int c, int value) {
		
		//������ ��ġ�� ���� �ִ���?
		for(int i = 0 ; i<9; i++) {
			if(N[r][i]==value) return false;
		}
		
		//�࿡�� ��ġ�� ���� �ִ���?
		for(int i = 0 ; i<9; i++) {
			if(N[i][c]==value) return false;
		}
		
		// ����� ������ �Ǵ� ���� ��� �ε��� ã��
		int block_row = r/3*3;	
		int block_col = c/3*3;
		
		//��Ͽ��� ��ġ�� ���� �ִ���?
		for(int i = block_row ; i<block_row+3; i++) {
			for(int j = block_col ; j<block_col+3; j++) {
				if(N[i][j]==value) return false;
			}
		}
		
		
		
		return true;
		

	}
	

}

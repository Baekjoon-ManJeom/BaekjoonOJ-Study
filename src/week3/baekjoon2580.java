package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon2580 {
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N[][] = new int[9][9];
		for(int i =0; i<9; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line," ");
			for(int j =0; j<9; j++) {
				N[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(N,0);

	}
	
	public static void sudoku(int[][]N, int depth) {
		if(depth==8) {
			for(int i =0; i<9; i++) {
				for(int j =0; j<9; j++) {
					System.out.printf(N[i][j]+" ");
				}
				System.out.printf("\n");
			}
		}
		
		boolean visit[] =new boolean[10];
		visit[0] = true;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0; i<9; i++) {
			if(N[depth][i]!=0) {
				visit[N[depth][i]] = true;	//visit배열을 통해 행에서 없는 번호를 파악
			}
		}
		for(int i =0; i<9; i++) {
			if(visit[i]==false) {
				arr.add(i);
			}
		}
		for(int i =0; i<9; i++) {
			if(N[depth][i]==0) {
				arr.get(i)
			}
		}
		
	}

}

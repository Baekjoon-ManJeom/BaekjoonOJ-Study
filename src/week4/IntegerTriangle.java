package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class IntegerTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int n = Integer.parseInt(br.readLine());
 
		int[][] arr = new int[n][n];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		//하위에서부터 값을 더해가며 0,0 자리에 최댓값이 남게 한다.
		for (int i = n-1 ; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				arr[i-1][j] += Math.max(arr[i][j], arr[i][j + 1]);
			}
		}
 
		System.out.println(arr[0][0]);

	}

}

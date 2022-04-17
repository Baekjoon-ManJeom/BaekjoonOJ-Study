package week8;

import java.util.Scanner;

public class Quadtree {
	
	public static int[][] img;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		img = new int[N][N];	
        
		for(int i = 0; i < N; i++) {
			String str = in.next();
			
			for(int j = 0; j < N; j++) {
				img[i][j] = str.charAt(j) - '0';
			}
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
		
		in.close();
	}
	
	public static void QuadTree(int x, int y, int size) {
		
		if(isPossible(x, y, size)) {
			sb.append(img[x][y]);
			return;
		}
		
		int newSize = size / 2;	//절반 나누기
		
		sb.append('(');	//괄호 열기
		
		QuadTree(x, y, newSize);						// 1사분면
		QuadTree(x, y + newSize, newSize);				// 2사분면
		QuadTree(x + newSize, y, newSize);				// 3사분면
		QuadTree(x + newSize, y + newSize, newSize);	// 4사분면
		
		sb.append(')');	//괄호 닫기
			
	}
	
	
	public static boolean isPossible(int x, int y, int size) {
		int value = img[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != img[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
 
}
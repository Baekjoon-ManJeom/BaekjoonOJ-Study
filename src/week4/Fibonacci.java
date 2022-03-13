package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/* Á¡È­½Ä
 * 
 * n°ª  0È½¼ö 1È½¼ö
 * 0	1	 0
 * 1	0	 1
 * 2	1	 1
 * 3	1	 2
 * 4	2 	 3
 * 5	3	 5
 * 
 * nÀÇ 0È½¼ö = n-1ÀÇ 0È½¼ö + n-2ÀÇ 0È½¼ö
 * nÀÇ 1È½¼ö = n-1ÀÇ 1È½¼ö + n-2ÀÇ 1È½¼ö
*/


public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int t = Integer.parseInt(br.readLine());
 
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] zero = new int [41];
		int[] one = new int [41];
		
		zero[0] = 1; //n=0ÀÏ ¶§ 0ÀÇ È½¼ö
		zero[1] = 0; //n=1ÀÏ ¶§ 0ÀÇ È½¼ö
		one[0] = 0; //n=0ÀÏ ¶§ 1ÀÇ È½¼ö
		one[1] = 1; //n=1ÀÏ ¶§ 1ÀÇ È½¼ö
		
		for(int i = 2; i < 41; i++) {
			zero[i] = zero[i-1] + zero[i-2]; //Á¡È­½ÄÀ» ÀÌ¿ëÇÏ¿© 0°ú 1ÀÇ È½¼ö¸¦ ¹è¿­¿¡ ´©Àû
			one[i] = one[i-1] + one[i-2];
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(zero[arr[i]] + " " + one[arr[i]]);
		}

	}

}

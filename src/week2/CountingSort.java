package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountingSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] count = new int[10001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())] ++;
        }
 
        br.close();
 
        StringBuilder sb = new StringBuilder();
 
        for(int i = 1; i < 10001; i++){
            while(count[i] > 0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
	}

}

package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

/*
 메모리 : 142020 KB
 시간 : 1516 ms
 */

public class baekjoon2751 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> t = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {				//정렬되지 않은 배열 입력받음.
			t.add (Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(t);
		
		for(int x : t) {
		bw.write(String.valueOf(x)); 	// BufferedWriter는 String타입으로 출력되므로 int->String 타입으로 변환해주어야 한다.
		bw.write("\n");
		
		}
		bw.close();
		br.close();
		

		
		
	}

}



package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

/*
 �޸� : 142020 KB
 �ð� : 1516 ms
 */

public class baekjoon2751 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> t = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {				//���ĵ��� ���� �迭 �Է¹���.
			t.add (Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(t);
		
		for(int x : t) {
		bw.write(String.valueOf(x)); 	// BufferedWriter�� StringŸ������ ��µǹǷ� int->String Ÿ������ ��ȯ���־�� �Ѵ�.
		bw.write("\n");
		
		}
		bw.close();
		br.close();
		

		
		
	}

}



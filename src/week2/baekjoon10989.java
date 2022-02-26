package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
�޸� : 379976 KB
�ð� : 2092 ms
*/

// ī���� ���� : '���� ����'�� �ִ� ��쿡 ���ؼ��� O(N)�� �ð� ���⵵�� ��Ÿ���� ������ ���� �˰���
//			

public class baekjoon10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int N = Integer.parseInt(br.readLine());
        int []t = new int[N];
        int []count = new int [10000001];
        for(int i = 0; i<N; i++) {
        	t[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i<count.length; i++) {
        	count[i] = 0;						// count�迭�� ���� ���� 0���� �����Ѵ�.
        }
        for(int j = 0; j<N;j++) {
        	count[t[j]]+=1;						// t�迭�� ���� �ε����� ���� count�迭�� ���� 1 �߰��Ѵ�
        }										// --> count�迭�� ���������� ������ָ� t�迭�� �������� ������ �ȴ�. 
	
        for(int i = 0; i<count.length; i++) {
        	if(count[i]>0) {					// count�迭�� ���� �ִ� �ε����� ����Ѵ�.
        		for(int j = 0; j<count[i]; j++) {	// �ε����� 1�̻��̸� �ߺ����� �ִ� ���̹Ƿ� �ߺ���ŭ ����Ѵ�.
        			bw.write(String.valueOf(i));
        			bw.write("\n");
        		}
        	}
        }
        bw.flush();
        bw.close();
        br.close();
	}

}

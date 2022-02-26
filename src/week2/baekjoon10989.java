package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
메모리 : 379976 KB
시간 : 2092 ms
*/

// 카운팅 정렬 : '범위 조건'이 있는 경우에 한해서는 O(N)의 시간 복잡도를 나타내는 굉장히 빠른 알고리즘
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
        	count[i] = 0;						// count배열에 값을 전부 0으로 설정한다.
        }
        for(int j = 0; j<N;j++) {
        	count[t[j]]+=1;						// t배열의 값을 인덱스로 가진 count배열에 값을 1 추가한다
        }										// --> count배열을 순차적으로 출력해주면 t배열이 오름차순 정렬이 된다. 
	
        for(int i = 0; i<count.length; i++) {
        	if(count[i]>0) {					// count배열에 값이 있는 인덱스만 출력한다.
        		for(int j = 0; j<count[i]; j++) {	// 인덱스가 1이상이면 중복값이 있는 것이므로 중복만큼 출력한다.
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

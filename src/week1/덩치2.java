package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//14,116kb	128ms
public class 덩치2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        String[] str;
        for(int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);	// [i][0] : 몸무게
            arr[i][1] = Integer.parseInt(str[1]);	// [i][1] : 키
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if (i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
		System.out.println(sb);
    }
}
/*
* 쉬운걸 왜 어렵게 접근했을까...
* 정말 단순히 input이 50개 밖에 안되니깐 배열에 넣고,
* 자기보다 큰게 있을때마다 ++로 랭크를 하나씩 낮춰주면서 붙여주면되는데..
* 왜 Class를 만들고, Sorting을 해주면서 계산했는가..;;
* */

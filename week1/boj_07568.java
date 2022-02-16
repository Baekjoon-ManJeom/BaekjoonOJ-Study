package boj.level11;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 덩치
 * 14584 KB
 * 144 ms
 * 959 B
 */
public class boj_07568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] stu = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            stu[i][0] = Integer.parseInt(st.nextToken());
            stu[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 0; i < N; i++) {
            int cnt = 1;

            for (int j = 0; j < N; j++) {
                if (stu[i][0] < stu[j][0] && stu[i][1] < stu[j][1]) {
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }
    }
}

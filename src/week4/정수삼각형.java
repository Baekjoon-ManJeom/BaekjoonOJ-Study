package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int j=0;
            while(st.hasMoreTokens()){
                arr[i][j++] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++)
                arr[i][j] += Math.max(arr[i+1][j],arr[i+1][j+1]);
        }
        System.out.println(arr[0][0]);
    }
}

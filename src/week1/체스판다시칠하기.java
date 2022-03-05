package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 14288 kb , 132ms
public class 체스판다시칠하기 {
    static char[] check = {'W', 'B'};
    static char[][] chess;
    public static void main(String[] args) throws IOException {
        // input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]), m = Integer.parseInt(t[1]);
        chess = new char[n][m];
        for (int i = 0; i<n ; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                chess[i][j] = chars[j];
            }
            // System.arraycopy(chars, 0, chess[i], 0, m); // 이렇게도 가능
        }
        // 순회하기
        int res = 0, min=64;
        for (int i = 0; i<= n-8 ; i++) {
            for (int j = 0; j <= m-8; j++) {
                res = chessCount(i,j);
                min = Math.min(min,res);
            }
        }
        // 결과 출력
        System.out.println(min);
    }
    //
    public static int chessCount(int a, int b){
        int res = 0;
        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                if (chess[i][j] == check[(i + j) % 2])
                    res++;
            }
        }
        res = Math.min(64 - res, res);
        return res;
    }
}

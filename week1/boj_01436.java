package boj.level11;

import java.io.*;

/**
 * 영화감독 숌
 * 85996 KB
 * 296ms
 * 469 B
 */
public class boj_01436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int cnt = 0;
        int result = 665;

        while (N != cnt) {
            result++;

            if (String.valueOf(result).contains("666")) cnt++;
        }
        System.out.println(result);
    }
}

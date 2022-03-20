package boj.level16_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 동전 0
 */
public class boj_11047_동전0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] coin = new int[Integer.parseInt(st.nextToken())];
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < coin.length; i++) {
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = coin.length - 1; i >= 0; i--) {
            count += K / coin[i];
            K %= coin[i];
        }
        System.out.println(count);
    }
}

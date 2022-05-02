package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        int[] DP = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        DP[0] = 1;
        for (int i = 1; i < T; i++)
            DP[i] = arr[i - 1] == arr[i] ? DP[i - 1] : DP[i - 1] + 1;
        System.out.println(DP[T - 1]);
        br.close();
    }
}
// 이해가 안된다. O(n) 으로 될것같은데 이게 무슨 DP인지...
// 내 코드가 왜 안되는지
// 내가 문제를 잘 이해한건 맞는지.. 하나도 모르겠어

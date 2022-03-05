package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 22,288kb 	336ms - Scanner
// 14,456kb     132ms - BufferedReader
public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        br.close();
        // 정렬
        Arrays.sort(arr);
        // 출력
        for (int i : arr)
            sb.append(i).append("\n");

        System.out.println(sb.toString());
    }
}

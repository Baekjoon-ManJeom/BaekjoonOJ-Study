package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 주의 ! - 피보나치는 기하급수적으로 수가 커지므로 overflow를 주의하여 Long을 쓰자
public class 파도반수열 {
    static Long[] arr = new Long[101];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        arr[0] = 0L;
        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        int n;
        for (int i = 0; i < T; i++) {
             n  = Integer.parseInt(br.readLine());
            sb.append(fibo(n)).append("\n");
        }
        System.out.println(sb);
    }
    static Long fibo(int n){
        if(arr[n] == null)
            arr[n] = fibo(n-3) + fibo(n-2);
        return arr[n];
    }
}

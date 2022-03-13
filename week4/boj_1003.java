import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
  public static int dp[] = new int[42];

  public static int fibonacci(int n) {
      //top down 방식 피보나치
    if (dp[n] != -1)
      return dp[n];
    if (n == 0) {
      return dp[n] = 0;
    } else if (n == 1) {
      return dp[n] = 1;
    } else {
      return dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int test = Integer.parseInt(br.readLine());

    for (int i = 0; i <= 41; i++)
      dp[i] = -1;
    fibonacci(41);
    while (test-- > 0) {
      int n = Integer.parseInt(br.readLine());
      if (n == 0) { //0은 예외처리
        bw.write(1 + " " + 0 + "\n");
        continue;
      }
      bw.write(dp[n-1] + " " + dp[n] + "\n");
    }
    bw.close();
    br.close();
    //결과 	16088kb ,시간160ms
  }
}
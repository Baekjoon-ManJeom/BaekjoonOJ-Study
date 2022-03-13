import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static int dp[][], arr[][], n;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    n = Integer.parseInt(br.readLine());
    dp = new int[n][n];
    arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j <= i; j++) {
        dp[i][j] = -1;
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    bw.write(rec(0,0)+"\n");
    bw.close();
    br.close();
    //결과 메모리27288kb, 시간 320ms
  }

  public static int rec(int y, int x) {
    if (y >= n || x >= n)
      return 0;
    if (dp[y][x] > -1)//메모이제이션
      return dp[y][x];
    return dp[y][x] = Math.max(rec(y + 1, x), rec(y + 1, x + 1)) + arr[y][x];//y+1,x 와 y+1,x+1중 가장큰것을 선택
  }
}
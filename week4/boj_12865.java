import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static int n, k, w[], v[], dp[][];

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    w = new int[n];
    v = new int[n];
    dp = new int[n + 1][k + 1];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      w[i] = Integer.parseInt(st.nextToken());
      v[i] = Integer.parseInt(st.nextToken());
    }
    //메모이제이션을 위해 -1로 초기화
    for (int i = 0; i < n; i++)
      Arrays.fill(dp[i], -1);
    bw.write(rec(0,0)+"\n");
    bw.close();
    br.close();

    //결과 메모리55432kb, 시간 268ms
  }

  public static int rec(int i, int W) {
    if (i >= n || W > k) //없는 물건 혹은 무게합이 k를 초과
      return 0;
    if (dp[i][W] != -1)//메모이제이션
      return dp[i][W];
    if (W + w[i] > k)//해당 물건을 선택한다면 무게 초과해서 선택불가
      return dp[i][W] = rec(i + 1, W);
    return dp[i][W] = Math.max(rec(i + 1, W), rec(i + 1, W + w[i]) + v[i]);// 해당물건을선택 할지 말지 
  }
}

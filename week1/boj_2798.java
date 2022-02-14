import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine().toString());

    //입력
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int max = 0;
    st = new StringTokenizer(br.readLine().toString());
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = Integer.parseInt(st.nextToken());
    
    //solve
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          //3개의카드중 m이하면서 m에 가장가까운것 -> m이하면서 가장큰값 찾기
          if (sum <= m && max < sum) {
            max = sum;
          }
        }
      }
    }
    bw.write(max + "\n");

    br.close();
    bw.close();
    
    //결과
    //메모리 15840KB, 시간 148ms
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public static int n, k;
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<>();
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    for(int i=0;i<n;i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(list,Collections.reverseOrder());
    int res=0;
    for(int i=0;i<n;i++) {
      int money = list.get(i);
      res+=k/money;
      k%=money;
    }
    bw.write(res+"\n");
    br.close();
    bw.close();
  }
}

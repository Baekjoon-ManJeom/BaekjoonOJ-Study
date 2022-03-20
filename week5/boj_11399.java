import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static int n;
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n= Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
    int arr[] = new int[n];
    for(int i=0;i<n;i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    int res=0;
    int sum=0;
    for(int i=0;i<n;i++) {
      res+=arr[i]+sum;
      sum+=arr[i];
    }
    bw.write(res+"\n");
    br.close();
    bw.close();
  }
}

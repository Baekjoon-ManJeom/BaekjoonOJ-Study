import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    boolean chk[]  = new boolean[2000001];
    int buf=1000000;
    //계수정렬
    for(int i=0;i<n;i++) {
      chk[Integer.parseInt(br.readLine())+buf]=true;
    }
    StringBuilder sb = new StringBuilder();
    for(int i=-buf;i<=buf;i++)
      if(chk[i+buf])sb.append(i+"\n");
    System.out.println(sb);
    br.close();
    bw.close();

    //결과 시간 : 912ms , 메모리 129232KB
  }
}
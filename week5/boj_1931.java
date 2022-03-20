import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  public static int n;
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Pair> list = new ArrayList<>();
    
    n = Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a= Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      list.add(new Pair(a,b));
    }
    Collections.sort(list);
    Pair p = list.get(0);
    int res=1;
    for(int i=1;i<n;i++) {
      Pair p2 = list.get(i);
      if(p2.a>=p.b) {
        p=p2;
        res++;
      }
    }
    bw.write(res+" ");
    br.close();
    bw.close();
  }
}

class Pair implements Comparable<Pair>{
  public Integer a,b;
  public Pair(Integer a, Integer b) {
    super();
    this.a = a;
    this.b = b;
  }
  @Override
  public int compareTo(Pair o) {
    if(b-o.b<0) //끝나는시간 기준으로 오름차순
      return -1;
    else if(b-o.b>0)
      return 1;
    else
      return a-o.a;//같다면 시작시간으로 오름차순
  }
  
}
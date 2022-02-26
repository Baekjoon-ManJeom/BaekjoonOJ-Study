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
    int count[]  = new int[20001];
    int buf=10000;
    
    //계수정렬
    for(int i=0;i<n;i++) {
      count[Integer.parseInt(br.readLine())+buf]++;
    }
    for(int i=-buf;i<=buf;i++){
      while(count[i+buf]>0) {
        bw.write(i+"\n");
        count[i+buf]--;
      }
    }
    br.close();
    bw.close();
    //결과 시간 : 1780ms , 메모리 300532KB
  }
}
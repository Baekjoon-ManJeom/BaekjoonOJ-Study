import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static int n;
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
   
    for(int i=0;i<n;i++) {
      String input[] = br.readLine().split(" ");
      if(input[0].equals("push"))
        list.add(Integer.parseInt(input[1]));
      else if(input[0].equals("pop")) {
        if(list.size()>0) {
          bw.write(list.get(list.size()-1)+"\n");
          list.remove(list.size()-1);
        }
        else
          bw.write(-1+"\n");
      }
      else if(input[0].equals("size")) {
        bw.write(list.size()+"\n");
      }
      else if(input[0].equals("empty")) {
        bw.write((list.isEmpty()?1:0)+"\n");
      }
      else {
        if(list.size()>0) {
          bw.write(list.get(list.size()-1)+"\n");
        }
        else
          bw.write(-1+"\n");
      }
    }
    br.close();
    bw.close();
  }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int idx = 0;
    TreeSet<Integer> s = new TreeSet<Integer>();

    //n이 최대 1만 666*10000까지 생각하면됨
    //666으로 시작하는 모든 숫자를 treeset으로 넣어줌 ->중복제거+ 정렬을위해
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          for (int l = 0; l < 10; l++) {
            s.add(6660000 + i * 1000 + j * 100 + k * 10 + l);
            s.add(1000000 * i + 666000 + j * 100 + k * 10 + l);
            s.add(1000000 * i + j * 100000 + 66600 + k * 10 + l);
            s.add(1000000 * i + j * 100000 + k * 10000 + 6660 + l);
            s.add(1000000 * i + j * 100000 + k * 10000 + l * 1000 + 666);
          }
        }
      }
    }
    Iterator<Integer> it = s.iterator();
    int res[] = new int[s.size()]; //데이터하나 출력이라 필요없긴하지만 if문쓰기 귀찮음
    while (it.hasNext())
      res[idx++] = it.next();
    bw.write(res[n - 1] + "\n");
    bw.close();
    br.close();
    //결과
    // 메모리 21856KB , 시간 284ms
  }
}

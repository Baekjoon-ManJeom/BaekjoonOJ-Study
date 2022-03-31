package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
// HashMap - Collection이 빠르지만, 메모리를 많이써서 오히려 메모리초과로 오답처리됨
public class 신나는함수실행 {
    static HashMap<Memo,Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(); // 결과 반환
        while(true){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a ==-1 && b ==-1 && c == -1)
                break;
            int res = w(a,b,c);
            map.put(new Memo(a,b,c),res);
            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(res).append("\n");
        }
        System.out.println(sb);

    }
    public static int w(int a, int b, int c){
        Memo memo = new Memo(a,b,c);
        int x = map.getOrDefault(memo,-1);
            // 하나라도 0이하는 바로 1 반환
            if(a <= 0 || b <= 0 ||c <= 0) {
                return 1;
            }
            // 하나라도 20 초과시 w(20,20,20) =  1048576 반환
            if(a > 20 || b > 20 || c > 20) {
                return 1048576;
            }
            // 메모이제이션 활용 - 이미 했던 연산값은 바로 가져옴
            if(map.get(memo) != null)
                return map.get(memo);
            // 그 외 case는 아래와 같이 호출과정을 거침
            if(a<b && b<c) {
                map.put(memo, w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c));
                return map.get(memo);
            }
            map.put(memo, w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1));
            return map.get(memo);
        }
}
class Memo{
    int a,b,c;
    public Memo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

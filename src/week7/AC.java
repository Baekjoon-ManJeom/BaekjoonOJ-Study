package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < T; i++) {
            // init
            boolean err = false; // 에러여부 체크
            boolean order = true; // 방향 초기화
            q.clear(); // 큐  비우기
            // input
            String p = br.readLine(); // p 문자열
            int n = Integer.parseInt(br.readLine()); // 배열 크기 (사용안함)
            String [] tmp = br.readLine().replaceAll("[^0-9,]", "").split(",");
            int [] arr = new int[n];
            if(n!=0)
                arr = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
            for (int s : arr) q.add(s);

            // 연산
            L1:
            for (char c : p.toCharArray()) {
                switch(c){
                    case 'R':
                        order = !order;
                        break;
                    case 'D':
                        if(q.isEmpty()){
                            err = true;
                            sb.append("error\n");
                            break L1;
                        }
                        if(order) q.poll();
                        else q.remove(q.size());
                        break;
                }
            }
            // 결과저장
            if(!err) {
                List<Integer> collect = new ArrayList<>(q);
                if (order)
                    sb.append(q).append("\n");
                else{
                    Collections.reverse(collect);
                    sb.append(collect).append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}

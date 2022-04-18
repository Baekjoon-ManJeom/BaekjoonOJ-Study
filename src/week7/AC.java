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
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < T; i++) {
            // init
            boolean err = false; // 에러여부 체크
            boolean order = true; // 방향 초기화
            deque.clear();
            // input
            String p = br.readLine(); // p 문자열
            String n = br.readLine(); // 배열 크기 (사용안함)
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            // 준비
            while(st.hasMoreTokens())
                deque.add(st.nextToken());
            // 연산
            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    order = !order;
                    continue;
                }
                if (c == 'D') {
                    if (deque.isEmpty()) {
                        err = true;
                        break;
                    }
                    if(order)
                        deque.poll();
                    else deque.remove(Integer.toString(deque.size()));
                }
            }
            // 결과저장
            if(!err) {
                if (order)
                    sb.append(deque).append("\n");
                else{
                    sb.append("[");
                    while (!deque.isEmpty()) {
                        sb.append(order ? deque.removeFirst() : deque.removeLast());
                        if (deque.size() != 0)
                            sb.append(',');
                    }
                    sb.append(']').append("\n");
                }
            }else{
                sb.append("error\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
/*
4
RDD
4
[1,2,3,4]
DD
1
[42]
RRD
6
[1,1,2,3,5,8]
D
0
[]*/
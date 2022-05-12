package boj.level22_우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj_11286_절댓값힙 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int absO1 = Math.abs(o1);
            int absO2 = Math.abs(o2);

            if (absO1 > absO2) {
                return 1;
            } else if (absO1 == absO2) {
                return o1 - o2;
            } else {
                return -1;
            }
        });
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int x;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());

            if (x != 0) {
                pq.offer(x);
            } else {
                if (pq.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(pq.poll() + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}

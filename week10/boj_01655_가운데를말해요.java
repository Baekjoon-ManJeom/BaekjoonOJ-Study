package boj.level22_우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class boj_01655_가운데를말해요 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> descPQ = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> ascPQ = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if (descPQ.size() == ascPQ.size()) {
                descPQ.offer(num);
            } else {
                ascPQ.offer(num);
            }

            if (!descPQ.isEmpty() && !ascPQ.isEmpty() && (descPQ.peek() > ascPQ.peek())) {
                int temp = ascPQ.poll();
                ascPQ.offer(descPQ.poll());
                descPQ.offer(temp);
            }
            sb.append(descPQ.peek()).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}

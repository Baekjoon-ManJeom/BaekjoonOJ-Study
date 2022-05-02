package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 가운데를말해요 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((o1, o2) -> o2-o1);
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(br.readLine());
            if(minpq.size() == maxpq.size()) maxpq.add(tmp);
            else minpq.add(tmp);
            if(!maxpq.isEmpty() && !minpq.isEmpty()){
                if(minpq.peek() < maxpq.peek()) {
                    int swap = minpq.poll();
                    minpq.add(maxpq.poll());
                    maxpq.add(swap);
                }
            }
            sb.append(maxpq.peek()).append("\n");
        }
        System.out.println(sb);
    }
}


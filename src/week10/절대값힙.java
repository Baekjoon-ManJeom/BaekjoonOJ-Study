package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 절대값힙 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) != Math.abs(o2))
                return Math.abs(o1) -Math.abs(o2);
            else
                return o1 -o2;
        });
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(br.readLine());
            if(tmp==0){
                if(pq.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(pq.poll());
                continue;
            }
            pq.add(tmp);
        }
    }
}

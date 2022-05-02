package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최대힙 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
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

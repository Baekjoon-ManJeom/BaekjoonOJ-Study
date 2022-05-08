package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AbsoluteValueHeap {
	
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        });

        for(int i = 0 ; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){  //절대값이 가장 작은 값 출력
                if(queue.isEmpty()) { //비어있을 경우 0 출력
                	System.out.println("0");
                }
                else {
                	System.out.println(queue.poll());
                }
            }else{
                queue.offer(num); //값 입력
            }
        }
	}
}

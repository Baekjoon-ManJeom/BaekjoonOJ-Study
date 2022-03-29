package week7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 초기화
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        // 계산
        while(q.size() != 1){
            q.remove(q.peek());
            q.offer(q.poll());
        }
        System.out.println(q.peek());
    }
}

package week5;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 동전 {
    static int N;
    public static void main(String[] args) throws IOException {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++)
            set.add(sc.nextInt());
        sc.close();
        // 값 구하기
        int ans=0;
        for (Integer i : set) {
            ans += N / i;
            N = N % i ;
        }
        System.out.println(ans);
    }
}

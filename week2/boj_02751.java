package boj.level12_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 수 정렬하기 2
 * Collection.sort(List)
 * Tim Sort 사용
 * Hybrid sorting algorithm = 합병정렬 + 삽입정렬
 * O(n) ~ O(nlogn)
 *
 * 164500 KB
 * 1540 ms
 * 891 B
 */
public class boj_02751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(list);

        for (int val : list) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }
}

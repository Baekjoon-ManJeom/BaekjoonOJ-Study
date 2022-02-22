package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *메모리 : 335200KB
 *시간   : 2752ms
 * * */
public class 수정렬하기2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        for (int data : list) {
            sb.append(data).append("\n");
        }

        System.out.println(sb);


    }
}

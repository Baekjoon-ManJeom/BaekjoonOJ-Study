package boj.level16_그리디;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ATM
 */
public class boj_11399_ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += arr[j];
            }
        }
        System.out.println(sum);
    }
}

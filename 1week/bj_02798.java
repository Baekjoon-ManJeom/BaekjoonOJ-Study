package boj.class2;

import java.util.Scanner;

/**
 * 블랙잭
 * 17688KB
 * 240ms
 * 835B
 */
public class bj_02798 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = scanner.nextInt();
        int N = scanner.nextInt();
        int arr[] = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    tempSum = arr[i] + arr[j] + arr[k];

                    if (tempSum <= N && tempSum > maxSum) {
                        maxSum = tempSum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}

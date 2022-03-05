package week3;

import java.util.Scanner;
// 17,672kb  5,536ms
public class NQueen {
    static int n;
    static int cnt;
    static int[] arr;

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        // 계산
        arr = new int[n];
        NQueen(0);
        System.out.println(cnt);
    }

    // N개 놓이면 count++
    // 행번호만 넣어준다.
    public static void NQueen(int depth) {
        if (n == depth) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i; // 선택값((행)을 차례대로 넣는 배열
            if (isOk(depth)) {
                NQueen(depth + 1);
            }
        }
    }

    // 해당 자리 놓을 수 있는지 Check
    public static boolean isOk(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[i] == arr[depth]) // 같은행의 값을 이미 가지고 있는지 체크
                return false; // 이미 저장된 행번호
            if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i]))
                return false; // 대각선상에 놓인 번호 check
        }
        return true;
    }
}
    /*
    3    16
    4    88
    5    272
    6    680
    7    1376
    8    2576
    *//*
import java.util.Scanner;
public class NQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int s = n * n - 3 * n + 2;
        int sum = 0;
        while (n > 0) {
            sum += s * ((4 * n) - 4);
            n = n - 2;
            s = s -2;
        }
        System.out.println(sum);
    }
} */


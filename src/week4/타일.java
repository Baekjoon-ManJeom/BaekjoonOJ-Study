package week4;

import java.util.Scanner;

public class 타일 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000001]; // 왜 n+1이 안되는거지? 반복사용할것도 아니면서..
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++)
            arr[i] = (arr[i-2] + arr[i-1]) %15746;
        System.out.println(arr[n] %15746);
    }
}



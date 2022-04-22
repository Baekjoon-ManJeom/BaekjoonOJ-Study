package week4;

import java.util.Scanner;

public class 피보나치함수 {
    static StringBuilder sb = new StringBuilder();
    static Integer[][] arr = new Integer[41][2];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            Integer[] tmp = fibo(n);
            sb.append(tmp[0]).append(" ").append(tmp[1]).append("\n");
        }
        System.out.println(sb);
    }
    static Integer[] fibo(int n){
        if(arr[n][0] == null) {
            arr[n][0] = fibo(n - 2)[0] + fibo(n - 1)[0];
            arr[n][1] = fibo(n - 2)[1] + fibo(n - 1)[1];
        }
        return arr[n];
    }
}

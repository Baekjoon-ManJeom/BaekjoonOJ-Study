package week3;

import java.util.Scanner;
//  18,508kb ,224ms
public class 연산자끼워넣기 {
    static int n;
    static int[] arr;
    static int[] opr = new int[4];
    static int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < 4; i++)
             opr[i] = sc.nextInt();
        sc.close();
        // 경우의 수 연산
        dfs(arr[0],1);
        // 정답 출력
        System.out.println(max);
        System.out.println(min);
    }
    public static void dfs(int tmp , int cnt){
        if(cnt == n){
            max = Math.max(max,tmp);
            min = Math.min(min,tmp);
        }
        for (int i = 0; i < 4; i++) {
            if (opr[i] > 0) {
                opr[i] --;
                switch (i) {
                    case 0:
                        dfs(tmp + arr[cnt], cnt + 1);
                        break;
                    case 1:
                        dfs(tmp - arr[cnt], cnt + 1);
                        break;
                    case 2:
                        dfs(tmp * arr[cnt], cnt + 1);
                        break;
                    case 3:
                        dfs(tmp / arr[cnt], cnt + 1);
                        break;
                }
                opr[i]++;
            }
        }
    }

}

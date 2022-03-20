package week3;

import java.util.Scanner;
//19,040 KB , 252ms
public class N과M4 {
    // 중복가능한 순열을 만듬
    static int n,m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        // 순열 생성
        arr = new int[m];
        permu(0,1);
        // 순열 출력
        System.out.println(sb);
    }
    public static void permu(int depth, int at){
        if(m == depth){
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            for (int i = at; i <=n ; i++) {
                arr[depth] = i;
                permu(depth+1,i);
            }
        }
    }
}

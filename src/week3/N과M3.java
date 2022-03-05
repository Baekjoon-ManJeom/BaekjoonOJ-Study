package week3;

import java.util.Scanner;
// 71,296kB , 588ms
public class N과M3 {
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
        permu(0);
        // 순열 출력
        System.out.println(sb);
    }
    public static void permu(int depth){
        if(m == depth){
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            for (int i = 1; i <=n ; i++) {
                arr[depth] = i;
                permu(depth+1);
            }
        }
    }
}

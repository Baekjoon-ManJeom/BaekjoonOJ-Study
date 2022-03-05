package week3;

import java.util.Arrays;
import java.util.Scanner;

public class N과M1 {
    // 중복 가능한 조합을 만드는 문제
    static int n,m;
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        // 조합 출력
        Boolean[] chosen = new Boolean[n+1];
        Arrays.fill(chosen,false);
        for (int i = 1; i <= n; i++) {
            chosen[i] = true;
            comb(chosen,1,i+"");
            chosen[i] = false;
        }
    }
    // 조합 출력  (선택값체크배열,
    public static void comb(Boolean[] chosen, int depth, String str){
        if(m == depth){
            System.out.println(str);
        }
        else{
            for (int i = 1; i <=n ; i++) {
                if(!chosen[i]){
                    chosen[i] = true;
                    comb(chosen,depth+1,str+" "+i);
                    chosen[i] = false;
                }
            }
        }
    }
}

package week3;

import java.util.Arrays;
import java.util.Scanner;
// 18,700KB, 240ms
public class N과M2 {
    // 중복 불가한 조합을 만드는 문제
    static int n,m;
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        // 조합 출력
        Boolean chosen[] = new Boolean[n+1];
        Arrays.fill(chosen,false);
        for (int i = 1; i <= n; i++) {
            chosen[i] = true;
            combi(chosen,1,i+"",i);
            chosen[i] = false;
        }
    }
    // 조합 출력  (선택값체크배열,
    public static void combi(Boolean[] chosen, int depth, String str,int at){
        if(m == depth){
            System.out.println(str);
            return;
        }
        for (int i = at; i <=n ; i++) {
            if(!chosen[i]){
                chosen[i] = true;
                combi(chosen,depth+1,str+" "+i,i);
                chosen[i] = false;
            }
        }
    }
}

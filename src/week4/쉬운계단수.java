package week4;

import java.util.Scanner;

public class 쉬운계단수 {
    static int n;
    static Long[][] arr;
    final static long MOD = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Long[n+1][10];
        sc.close();
        long result =0L;
        for (int i = 0; i < 10; i++) {
             arr[1][i] = 1L;
        }
        for (int i = 1; i < 10; i++) { // 첫자리는 0이 올 수 없다
             result += func(n,i);
        }
        System.out.println(result % MOD);
    }
    static Long func(int digit,int val){ // 몇번째 자리인지, 해당자리의 값
        if(digit==1) // 원하는 길이만큼 만들어졌으면 반환
            return arr[1][val];
        if(arr[digit][val] == null){ // 아직 안구해졌으면 구해주고 반환
            if(val==0)
                arr[digit][val] = func(digit-1,1); // 0이면, 올라가는 경우만 존재
            else if(val==9)
                arr[digit][val] = func(digit-1,8); // 9이면, 내려가는 경우만 존재
            else
                arr[digit][val] = func(digit-1,val+1) + func(digit-1,val-1);
        }
        return arr[digit][val] % MOD;
    }
}

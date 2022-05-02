package week4;

import java.util.Scanner;

public class 일로만들기 {
    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        sc.close();
        arr[1] = 0;
        // DP
        Func(n);
        System.out.println(arr[n]);

    }
    static int Func(int n){
        if(n==1 || arr[n]!=0)
            return arr[n];
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c;
        if(n%3==0)
            a = Func(n/3)+1;
        if(n%2==0)
            b = Func(n/2)+1;
        c= Func(n-1)+1;
        return arr[n] += Math.min(c,Math.min(a,b));
    }
}

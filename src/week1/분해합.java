package week1;

import java.util.Scanner;
// 74520 kb	, 332 ms
public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++) {
            if (n == Constract(i)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
    public static int Constract(int n){
        int a=n;
        String tmp = Integer.toString(n);
        for (char c : tmp.toCharArray()) {
            a+= Character.getNumericValue(c);
        }
        return a;
    }
}

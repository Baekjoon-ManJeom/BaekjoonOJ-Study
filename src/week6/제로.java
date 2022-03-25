package week6;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int in;
        for (int i = 0; i < n; i++) {
            in = sc.nextInt();
            if(in==0)
                st.pop();
            else
                st.push(in);
        }
        int sum=0;
        for (Integer i : st) {
            sum+= i;
        }
        System.out.println(sum);

    }
}

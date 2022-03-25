package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String PS = br.readLine();
            boolean flag = true;
            for (char c : PS.toCharArray()) {
                if (c == '(') {
                    st.push(c);
                }
                else {
                    if (st.isEmpty()) { // 괄호가없는데 뺀다면?
                        flag = false;
                        break;
                    }
                    st.pop();
                }
            }
            if (!flag || !st.isEmpty()) // 연산후에도 짝이 맞으면
                System.out.println("NO");
            else
                System.out.println("YES");
            st.clear();
        }
    }
}

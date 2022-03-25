package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            switch (cmd.split(" ")[0]){
                case "push":
                    st.push(cmd.split(" ")[1]);
                    break;
                case "pop":
                    if(st.isEmpty()){
                        System.out.println("-1");
                    }else
                        System.out.println(st.pop());
                    break;
                case "top":
                    if(st.isEmpty()){
                        System.out.println("-1");
                    }else
                        System.out.println(st.peek());
                    break;
                case "empty":
                    if(st.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
            }
        }
    }
}

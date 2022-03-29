package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class 큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            switch (cmd.split(" ")[0]){
                case "push":
                    dq.push(cmd.split(" ")[1]);
                    break;
                case "pop":
                    if(dq.isEmpty()){
                        System.out.println("-1");
                    }else
                        System.out.println(dq.pollLast());
                    break;
                case "empty":
                    if(dq.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "size":
                    System.out.println(dq.size());
                    break;
                case "front" :
                    if(dq.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(dq.pollLast());
                    break;
                case "back":
                    if(dq.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(dq.pollFirst());
                    break;
            }
        }
    }
}

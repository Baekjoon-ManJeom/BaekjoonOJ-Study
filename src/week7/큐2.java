package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
// 빡세다 기준이... 반드시 BuffeeredReader와 StringBuilder 로 in/put하자
// 393,348 KB , 1520 ms
public class 큐2 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<String> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            switch (cmd.split(" ")[0]){
                case "push":
                    dq.push(cmd.split(" ")[1]);
                    break;
                case "pop":
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    }else
                        sb.append(dq.pollLast()).append("\n");
                    break;
                case "empty":
                    if(dq.isEmpty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "front" :
                    if(dq.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(dq.peekLast()).append("\n");
                    break;
                case "back":
                    if(dq.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(dq.peekFirst()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}

/*

15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front

 */
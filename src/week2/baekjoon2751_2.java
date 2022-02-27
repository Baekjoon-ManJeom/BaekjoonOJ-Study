package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
 
/*
메모리 : 199256 KB
시간 : 1752 ms
*/

public class baekjoon2751_2 {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
 
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        
       
        Collections.sort(arr);
 
        StringBuilder sb = new StringBuilder(); // StringBuilder를 사용하면 int->String 타입변환 필요없이 String으로 적용된다.
        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i) + "\n");
        }
 
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}


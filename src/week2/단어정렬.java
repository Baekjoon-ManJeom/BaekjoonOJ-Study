package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//  26,824kb ,336 ms
public class 단어정렬 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }
        br.close();
        // 정렬
        Arrays.sort(arr, (o1, o2) -> {
            if(o1.length() == o2.length())
                return o1.compareTo(o2);
            else
                return o1.length() - o2.length();
        });
        // 출력
        StringBuilder sb = new StringBuilder();
        String tmp ="";
        for (String s: arr) {
            if(!tmp.equals(s)) // 중복검사
                sb.append(s).append("\n");
            tmp = s;
        }
        System.out.println(sb.toString());
    }
}

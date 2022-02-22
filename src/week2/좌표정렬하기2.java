package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 78,272 kb , 780ms
public class 좌표정렬하기2 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++){
            String tmp = br.readLine();
            arr[i][0] = Integer.parseInt(tmp.split(" ")[0]);
            arr[i][1] = Integer.parseInt(tmp.split(" ")[1]);
        }
        br.close();
        // 정렬
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1])
                return o1[0] - o2[0];
            else
                return o1[1] - o2[1];
        });
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int[] a: arr)
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        System.out.println(sb.toString());
    }
}

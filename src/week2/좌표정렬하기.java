package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 79,720 kb , 824ms
public class 좌표정렬하기 {
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
            if(o1[0] == o2[0])
                return o1[1] - o2[1];
            else
                return o1[0] - o2[0];
        });
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int[] a: arr)
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        System.out.println(sb.toString());
    }
}

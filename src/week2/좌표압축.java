package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 219,776 kb , 3724ms
public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] tmp = br.readLine().split(" ");
        int[][] arr = new int[n][3]; // 0 : index , 1 : 좌표값 , 2 : rank 기록
        for (int i = 0; i < n; i++){
            arr[i][0] = i;
            arr[i][1] = Integer.parseInt(tmp[i]);
        }
        br.close();
        // 좌표값 정렬
        Arrays.sort(arr, (o1, o2) -> o1[1] - o2[1]);
        // 순위 기록
        int rank=0,next=arr[0][1];
        for (int i=0;i<arr.length;i++) {
            if(next!=arr[i][1])
                rank++;
            arr[i][2] = rank;
            next = arr[i][1];
        }
        // input 순서로 재정렬
        Arrays.sort(arr,(o1,o2)->o1[0]-o2[0]);
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int[] a: arr)
            sb.append(a[2]).append(" ");
        System.out.println(sb.toString());
    }
}

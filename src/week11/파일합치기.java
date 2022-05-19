package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 파일합치기 {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.ceil(7/2.0));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            // input
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                 arr[j] = Integer.parseInt(st.nextToken());
            }
            // brain
            Arrays.sort(arr);
            int idx = 0,j=0,len=arr.length-1;
            while(len!=0){
                if(j+1>=len){ // AOI 이면 초기화
                    idx=0;
                    j=0;
                    len /=2;
                }
                arr[idx++] = arr[j]+arr[j+1];
                j+=2;
            }
            sb.append(arr[0]);


        }
        System.out.println(sb);
        br.close();
    }

}

package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 랜선자르기 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println(upper_bound(m));
        br.close();
    }
    static long upper_bound(int m){
        long l=1; // 0이 아닌 자연수
        long r=arr[arr.length-1]+1; // 0으로 나누는 불상사를 막기 위함
        long sum;
        long mid;
        while(l<r){
            sum=0;
            mid = (l+r)/2;
            for (int j : arr) {
                sum += j / mid; // 여기때문에 r+1로 탐색 시작
            }
            if(sum<m)
                r = mid;
            else
                l = mid +1;
        }
        return l-1;
    }
}

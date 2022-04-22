package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
이진탐색은 정렬하가능한 자료를 절반으로 나누어가면서
값을 up down으로 탐색하는 알고리즘으로, n*logn의 복잡도를 가지는
빠른 탐색 알고리즘이다.
 */
// 43,440 kb ,  728 ms
public class 수찾기 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<m;i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(key)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    static int binarySearch(int key){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(key > arr[mid])
                left = mid+1;
            else if(key<arr[mid])
                right = mid -1;
            else
                return 1;
        }
        return 0;
    }
}

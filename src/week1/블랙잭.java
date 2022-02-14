package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙잭 {
    static int [] arr;
    static int N,M,ans=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 사용법 필수암기, throws IO익셉션
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // input
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<N;i++)
            bruteForce(arr[i],i+1,1);
        System.out.println(ans);
    }
    private static void bruteForce(int sum, int i,int cnt){
        if(cnt==3 && sum<=M) { // Array index의 끝이면 Stop
            ans = Math.max(ans, sum);
            return;
        }
        if(i>=N || cnt==3) return;
        for(;i<N;i++)
            bruteForce(sum+arr[i],i+1,cnt+1);
    }
}
/*
* 입력의 경우는 확실히 Scanner 보다는 BufferedReader 가 빠른 걸 볼 수 있다.
* 알고리즘의 경우 데이터가 워낙 적어 사실상 성능차는 안보이는 것 같다.
* */
package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 숫자카드2 {
    // HashMap - 150,868 kb  1000 ms
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<n;i++){
            String s = st.nextToken();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<m;i++){
            String s = st.nextToken();
            sb.append(map.getOrDefault(s,0)).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
    // 카운팅 정렬 - 196,720 kb , 940 ms
    // 배열의 길이는 int의 범위를 넘지못하며, 메모리 낭비가 클수있음을 명심
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[20000001]; // 입력 범위-10000000 ~ +10000000
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            arr[a+10000000]++; // 인덱스를 조정하여 값을 저장
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<m;i++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(arr[a+10000000]).append(" "); // 해당 값을 빼옴
        }
        System.out.println(sb);
    }
}

package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 통계학 {
    //68,384KB  760ms
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[n];
        int sum=0,mode;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i]; // 1.합계 - 산술평균
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        br.close();
        // 계산
        Arrays.sort(arr);
        int mid = arr[arr.length/2]; //2. 중앙값 (N이 홀수이므로 신경쓰지 않아도 됨)
        int range = arr[arr.length-1] - arr[0]; // 4.범위
        List<Map.Entry<Integer,Integer>> list_entry = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list_entry, ((o1, o2) -> {
            if(o2.getValue() == o1.getValue())
                return o1.getKey() - o2.getKey(); // 빈도가 같으면, 오름차순 정렬
            else
                return o2.getValue() - o1.getValue(); // 빈도가 다르면, 빈도순 내림차순 정렬
        }));
        if(list_entry.size()>1 && list_entry.get(0).getValue() == list_entry.get(1).getValue()) // 최빈값이 순위가 같으면
            mode = list_entry.get(1).getKey(); // 최빈값중 두번째로 작은값 출력
        else
            mode = list_entry.get(0).getKey();
        // 출력
        System.out.println(Math.round((float)sum/n)); // 1.산술평균
        System.out.println(mid);   // 2.중앙값
        System.out.println(mode);   // 3.최빈값
        System.out.println(range); // 4.범위

    }
}

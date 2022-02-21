package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 배열로 담아 정렬
// 359,676 kb  2456ms
public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        br.close();
        // 배열에 담아서 정렬
        Arrays.sort(arr);
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기3 {
    // list에 담아서 Collections로 정렬
    // 메모리 초과
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(Integer.parseInt(br.readLine()));
        br.close();
        // Array 배열에 담아서 정렬
        Collections.sort(list);
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i : list){ sb.append(i).append("\n");}
        System.out.println(sb.toString());
    }
}
*/
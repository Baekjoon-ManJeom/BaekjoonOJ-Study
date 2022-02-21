package week2;

import java.util.Arrays;
import java.util.Scanner;
//22,288kb 	336ms
public class 수정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

package week2;

import java.util.Arrays;
import java.util.Scanner;
// 17,688kb  220ms
public class 소트인사이드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        char[] arr = n.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i=arr.length-1 ;i>=0;i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}

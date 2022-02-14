package week1;

import java.util.Scanner;
// 87780kb	364ms
public class 영화감독숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0,i=0;
        while(cnt<n){
            i++;
            if(Integer.toString(i).contains("666"))
                cnt++;
        }
        System.out.println(i);
    }
}

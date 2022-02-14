package week1;

import java.util.Scanner;

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
/*
* 와 진짜 어렵다...
* 너무 어렵다;;
* 이 문제 점화식이 뭐야 대체;; @_@
* 어떡하지? 진짜 모르겠는데;;
* 자...잠만? 무차별 대응이 그런거야?.. 그냥 무식하게 다 돌리는거? ㅁㅊ
* ?
* */
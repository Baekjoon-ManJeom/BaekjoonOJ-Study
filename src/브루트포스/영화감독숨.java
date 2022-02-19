import java.util.Scanner;

/**
* 메모리: 89524KB
 * 시간: 404ms
* */
public class 영화감독숨 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        while (n > 0) {
            cnt++;

            String temp = String.valueOf(cnt);

            if (temp.contains("666")) {
                n--;
            }
        }

        System.out.println("cnt: " + cnt);
    }
}
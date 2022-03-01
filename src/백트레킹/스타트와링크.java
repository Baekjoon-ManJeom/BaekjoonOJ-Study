package 백트레킹;

import java.util.Scanner;


/**
 *메모리 : 21124KB
 * 시간: 500MS
 * */
public class 스타트와링크 {

    static int n;
    static int[][] map;
    static boolean[] visit;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        map = new int[n][n];

        visit = new boolean[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        combination(0, 0);
        System.out.println(min);


    }

    static void combination(int idx, int count) {

        if (count == n / 2) {
            cal();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combination(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }


    static  void cal() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j< n; j++) {

                if (visit[i] == true && visit[j] == true) {
                    team_start += map[i][j];
                    team_start += map[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }


        int value = Math.abs(team_start - team_link);

        if (min > value) {
            min = value;
        }

    }




}

package 브루트포스;

import java.util.Scanner;
/**
 *메모리 : 18416KB
 *시간  : 240MS
 * */
public class 덩치 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int personCount = scanner.nextInt();

        int[][] infos = new int[personCount][2];

        for (int i = 0; i < personCount; i++) {
            for (int j = 0; j < 2; j++) {

                infos[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < personCount; i++) {

            System.out.print(infos[i][0] + " , " + infos[i][1]);
            System.out.println();
        }

        for (int h = 0; h < personCount; h++) {// h : 행
            int rank = 1;
            for (int r = 0; r < personCount; r++) { // r : 열
                if (h == r) {
                    continue;
                } else if (infos[h][0] < infos[r][0] && infos[h][1] < infos[r][1]) {
                    rank += 1;
                }
            }
            System.out.println(rank);
        }
    }
}

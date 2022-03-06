package boj.level14_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스도쿠
 *
 * 79164 KB
 * 556 ms
 * 2623 B
 */
public class boj_02580 {

    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sdoku(0, 0);
    }

    private static void sdoku(int row, int col) {

        // 해당 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
        if (col == 9) {
            sdoku(row + 1, 0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        // 행과 열이 모두 채워졌을 경우 출력 후 종료
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);

            // 시스템 종료
            System.exit(0);
        }

        // 해당 위치가 빈 칸이면 1 ~ 9 까지 검사 시작
        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (possible(row, col, i)) {
                    arr[row][col] = i;
                    sdoku(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        sdoku(row, col + 1);
    }

    // 빈 칸에 들어갈 수 있는 값이 맞는지 여부
    private static boolean possible(int row, int col, int value) {

        // 열 검사 (세로)
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }

        // 행 검사 (가로)
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }

        // 3 X 3 정사각형 검사
        int x = (row / 3) * 3;
        int y = (col / 3) * 3;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        // 중복되는 것이 없을 경우 true
        return true;
    }
}

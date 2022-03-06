package boj.level14_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스타트와 링크
 *
 * 20800 KB
 * 312 ms
 * 2242 B
 */
public class boj_14889 {

    private static int N;
    private static int[][] arr;
    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(min);
    }

    private static void dfs(int asc, int depth) {
        if (depth == N / 2) {
            calc();
            return;
        }

        /*
            0 1, 0 2, 0 3, 1 2, 1 3, 2 3

            Arrays.toString(visited);

            [true, true, false, false]
            [true, false, true, false]
            [true, false, false, true]
            [false, true, true, false]
            [false, true, false, true]
            [false, false, true, true]
         */
        for (int i = asc; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;

                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    private static void calc() {
        int teamStart = 0;
        int teamLink = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i] && visited[j]) {
                    teamStart += arr[i][j];
                } else if (!visited[i] && !visited[j]) {
                    teamLink += arr[i][j];
                }
            }
        }
        int difference = Math.abs(teamLink - teamStart);

        if (difference == 0) {
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(min, difference);
    }
}



















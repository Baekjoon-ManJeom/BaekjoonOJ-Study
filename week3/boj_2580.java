import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static int n;
	public static int board[][];
	public static boolean row[][], col[][], polar[][];//가로 ,세로 ,좌표 방문처리
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		board = new int[10][10];
		row = new boolean[10][10];
		col = new boolean[10][10];
		polar = new boolean[10][10];
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if (board[i][j] == 0)
					continue;
				row[i][board[i][j]] = true;
				col[j][board[i][j]] = true;
				polar[cal(i, j)][board[i][j]] = true;
				cnt++;
			}
		}
		dfs(0, cnt);
		bw.close();
		br.close();
        //결과 시간 340ms ,메모리 21984kb
	}

	public static int cal(int i, int j) {
		return (i / 3) * 3 + j / 3;
	}

	public static void dfs(int idx, int cnt) throws IOException {
		if (cnt == 81) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					bw.write(board[i][j] + " ");
				}
				bw.write("\n");
			}
			bw.close();
			br.close();
			System.exit(0);
			return;
		}
		int y = idx / 9;
		int x = idx % 9;
		if (board[y][x] > 0) {
			dfs(idx + 1, cnt);
			return;
		}
		for (int i = 1; i <= 9; i++) {
			if (!row[y][i] && !col[x][i] && !polar[cal(y, x)][i]) {
				board[y][x] = i;
				row[y][i]=true;
				col[x][i]=true;
				polar[cal(y,x)][i]=true;
				dfs(idx + 1, cnt + 1);
				board[y][x] = 0;
				row[y][i]=false;
				col[x][i]=false;
				polar[cal(y,x)][i]=false;
			}
		}
	}
}
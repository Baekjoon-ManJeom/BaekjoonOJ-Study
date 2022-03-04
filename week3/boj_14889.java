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
	public static int visit[];
	public static int res = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		visit = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		comb(0,n/2); //최대 20C2 조합계산
		bw.write(res+"\n");
		bw.close();
		br.close();
        //결과 시간 472ms, 메모리 43008KB
	}

	public static void comb(int idx, int r) {
		if (r == 0) {
			List<Integer> l1 = new ArrayList<Integer>();
			List<Integer> l2 = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) {
				if (visit[i] == 0) 
					l1.add(i);
				else
					l2.add(i);
				
			}
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < l1.size()-1; i++) {
				for (int j = i+1; j < l1.size(); j++) {
					int y1 = l1.get(i);
					int x1 = l1.get(j);
					int y2 = l2.get(i);
					int x2 = l2.get(j);
					sum1 += board[y1][x1]+board[x1][y1];
					sum2 += board[y2][x2]+board[x2][y2];
				}
			}
			res = Math.min(res, Math.abs(sum1 - sum2));
			return;
		}
		for (int i = idx; i < n; i++) {
			if (visit[i] == 0) {
				visit[i] = 1;
				comb(i + 1, r - 1);
				visit[i] = 0;
			}
		}
	}
}
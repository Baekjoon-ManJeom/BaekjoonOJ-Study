package week12;

import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

//105,800 KB	1120 MS
public class dfs2 {
    static TreeSet<Integer>[] nodes;
    static int[] ans;
    static int order=1;
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        nodes = new TreeSet[n + 1];
        ans = new int[n + 1];
        for (int i = 1; i < nodes.length; i++) nodes[i] = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a].add(b);
            nodes[b].add(a);
        }
        dfs(s);
        for (int i = 1; i < ans.length; i++) {
            bw.write(ans[i]+"\n");
        }
        bw.close();
        br.close();
    }
    static void dfs(int cur){
        ans[cur] = order++;
        for (int i : nodes[cur]) {
            if(ans[i] == 0)
                dfs(i);
        }
    }
}
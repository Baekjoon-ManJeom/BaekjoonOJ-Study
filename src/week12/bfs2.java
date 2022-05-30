package week12;

import java.io.*;
import java.util.*;

public class bfs2 {
    static TreeSet<Integer>[] nodes;
    static int[] ans;
    static int order=1;
    static Queue<Integer> q = new LinkedList<>();
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
        for (int i = 1; i < nodes.length; i++) nodes[i] = new TreeSet<Integer>(Collections.reverseOrder());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a].add(b);
            nodes[b].add(a);
        }
        // brain
        q.add(s);
        ans[s] = order++;
        while(!q.isEmpty()) {
            bfs(q.poll());
        }
        // output
        for (int i = 1; i < ans.length; i++) {
            bw.write(ans[i]+"\n");
        }
        bw.close();
        br.close();
    }
    static void bfs(int cur){
        for (int i : nodes[cur]) {
            if(ans[i] == 0){
                ans[i] = order++;
                q.add(i);
            }
        }
    }
}
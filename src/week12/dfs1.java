package week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dfs1 {
    static Node[] nodes;
    static boolean [] visited;
    static int s;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        nodes = new Node[m];
        for (int i = 0; i < m; i++) {
             st = new StringTokenizer(br.readLine()," ");
             nodes[i] = new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        br.close();
        Arrays.sort(nodes);
        sb = new StringBuilder();
        sb.append(s).append("\n");
        visited = new boolean[m];
        dfs();
        System.out.println(sb);
    }
    static void dfs(){
        for (int i = 0; i < nodes.length; i++) {
            if(s == nodes[i].from){
                if(visited[i] == false){
                    visited[i] = true;
                    sb.append(nodes[i].to).append("\n");
                    s = nodes[i].to;
                    dfs();
                    return;
                }
            }
        }
        sb.append("0").append("\n");

    }
    static class Node implements Comparable<Node> {
        int from;
        int to;
        public Node(int from, int to) {
            this.from = from;
            this.to = to;
        }
        @Override
        public int compareTo(Node o) {
            if(from - o.from == 0)
                return to - o.to;
            return from - o.from;
        }
    }
}

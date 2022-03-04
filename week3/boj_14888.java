import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static int arr[],op[]=new int[4];
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++)
			op[i]=Integer.parseInt(st.nextToken());
		dfs(op[0],op[1],op[2],op[3],1,arr[0]);
		bw.write(max+"\n");
		bw.write(min+"\n");
		bw.close();
		br.close();

        //결과 시간 340ms , 메모리 21984KB
	}
	public static void dfs(int p,int mi,int mul,int div,int idx,int sum) {
		if(idx>=n) {
			max=Math.max(max, sum);
			min=Math.min(min, sum);
			return;
		}
		if(p>0)
			dfs(p-1,mi,mul,div,idx+1,sum+arr[idx]);
		if(mi>0)
			dfs(p,mi-1,mul,div,idx+1,sum-arr[idx]);
		if(mul>0)
			dfs(p,mi,mul-1,div,idx+1,sum*arr[idx]);
		if(div>0)
			dfs(p,mi,mul,div-1,idx+1,sum/arr[idx]);
	}
}
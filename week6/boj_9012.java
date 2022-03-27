import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			int t=0;
			for(char c : s.toCharArray()) {
				t+=c=='('?1:-1;
				if(t<0)
					break;
			}
			bw.write(t==0?"YES\n":"NO\n");
		}
		bw.close();
		br.close();
	}
}

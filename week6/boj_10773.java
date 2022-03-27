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
		List<Long> list =new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			long a = Long.parseLong(br.readLine());
			if(a==0)
				list.remove(list.size()-1);
			else
				list.add(a);
		}
		System.out.println(list.stream().mapToLong(Long::longValue).sum());
	}

}


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class backjoon1004 {

	static double distance(int ax, int ay, int bx, int by) {
		int dx = ax-bx;
		int dy = ay-by;
//		System.out.println(Math.sqrt((dx*dx) +(dy*dy)));
		return Math.sqrt((dx*dx) +(dy*dy));
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		
		int count = 0;
		for(int j =0; j<T; j++) {
			line = br.readLine();
			int x1 = Integer.parseInt(line.split(" ")[0]);
			int y1 = Integer.parseInt(line.split(" ")[1]);
			int x2 = Integer.parseInt(line.split(" ")[2]);
			int y2 = Integer.parseInt(line.split(" ")[3]);
			line = br.readLine();
			int n = Integer.parseInt(line);
			for(int i= 0; i<n; i++) {
				line = br.readLine();
				int x3 = Integer.parseInt(line.split(" ")[0]);
				int y3 = Integer.parseInt(line.split(" ")[1]);
				int r = Integer.parseInt(line.split(" ")[2]);
				boolean check1 =false;
				boolean check2 =false;
				if(distance(x1,y1,x3,y3) < r ) check1 = true;
				if(distance(x2,y2,x3,y3) < r ) check2 = true;
				if(check1==true && check2 ==false) {

					count++;
				}
				else if(check1==false && check2 ==true) {

					count++;
				}

				
			}
			bw.write(count + "\n");
			count = 0;
		}

		  bw.flush();
	        br.close();
	        bw.close();
	}

}
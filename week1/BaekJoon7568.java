package src.java.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon7568 {
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arrays = new int[n][2];

        for(int i = 0 ; i<n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arrays[i][0] = Integer.parseInt(st.nextToken());
            arrays[i][1] = Integer.parseInt(st.nextToken());
        }
        int point = 0;
        int rank = n;
        String test = "";
        for(int j = 0; j<n ; j++){

            for(int k = 0 ; k<n ; k++){

                if(j != k) {
                    if (arrays[j][0] > arrays[k][0]) {
                        point = point+1;
                    }
                    if (arrays[j][1] > arrays[k][1]) {
                        point = point+1;
                    }
                    if(arrays[j][0] == arrays[k][0] || arrays[j][1] == arrays[k][1]){
                        point = 1;
                    }
                    if (point == 2 || point ==1) {
                        rank = rank-1;
                    }
                    point = 0;
                }
            }
            test = test + " " + Integer.toString(rank);
            rank = n;
        }
        System.out.println(test.trim());

    }
}

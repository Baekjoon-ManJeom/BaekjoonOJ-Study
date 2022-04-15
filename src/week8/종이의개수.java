package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 345,836 kb , 1872 ms
public class 종이의개수 {
    static int[][] arr; // input matrix
    static HashMap<Integer, Integer> map = new HashMap<>(); // output map
    static int flag;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        // init map
        map.put(-1,0);
        map.put(0,0);
        map.put(1,0);
        // 분할정복
        divide(0,0,n);
        // 출력
        System.out.println(map.get(-1));
        System.out.println(map.get(0));
        System.out.println(map.get(1));

    }
    static void divide(int row,int col,int size){
        flag = arr[row][col];
        if(size==1){
            map.put(flag,map.get(flag)+1);
            return;
        }
        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col+size; j++) {
                if(flag != arr[i][j]){
                    int newSize = size/3;
                    divide(row,col,newSize);
                    divide(row,col+newSize,newSize);
                    divide(row,col+(newSize*2),newSize);

                    divide(row+newSize,col,newSize);
                    divide(row+newSize,col+newSize,newSize);
                    divide(row+newSize,col+(newSize*2),newSize);

                    divide(row+(2*newSize),col,newSize);
                    divide(row+(2*newSize),col+newSize,newSize);
                    divide(row+(2*newSize),col+(newSize*2),newSize);
                    return;
                }
            }
        }
        map.put(flag,map.get(flag)+1);
    }
}

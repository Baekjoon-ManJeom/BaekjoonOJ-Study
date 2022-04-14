package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//15568 kb , 164 ms
public class 색종이만들기 {
    static int[][] arr;
    static int a=0,b=0,flag;
    public static void main(String[] args) throws IOException {
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
        divide(0,0, arr.length);
        System.out.println(a);
        System.out.println(b);
    }
    public static  void divide(int row, int col, int size){
        flag = arr[row][col]; // 비교값 지정
        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col+size; j++) {
                if(flag != arr[i][j]){
                    int newSize = size/2;
                    divide(row,col,newSize);
                    divide(row+newSize,col,newSize);
                    divide(row,col+newSize,newSize);
                    divide(row+newSize,col+newSize,newSize);
                    return;
                }
            }
        }
        if(flag ==0)
            a++;
        else
            b++;
    }
}

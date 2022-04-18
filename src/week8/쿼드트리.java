package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. 모든점이 같은값이면 괄호없이 0 ,1 이다.
2. 쪼개져 들어가기 시작하면서부터 괄호가 열린다.
3. 검사하는 구간이 1x1 이면 더이상 들어가지 않고, 괄호도 열리지 않는다.
 */
// 14,172 kb 144 mb
public class 쿼드트리 {
    static int[][] arr;
    static int flag;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i=0;i<n;i++){
            String tmp = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Character.getNumericValue(tmp.charAt(j));
            }
        }
        br.close();
        divide(0,0, arr.length);
        System.out.println(sb);
    }
    public static  void divide(int row, int col, int size){
        flag = arr[row][col]; // 비교값 지정 0 or 1
        if(size==1) {
            sb.append(arr[row][col]);
            return;
        }
        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col+size; j++) {
                if(flag != arr[i][j]){
                    sb.append("(");
                    int newSize = size/2;
                    divide(row,col,newSize);
                    divide(row,col+newSize,newSize);
                    divide(row+newSize,col,newSize);
                    divide(row+newSize,col+newSize,newSize);
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(flag);
    }
}

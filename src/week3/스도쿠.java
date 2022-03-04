package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 26,096 KB , 512ms
public class 스도쿠 {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        // 입력과 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9][9];
        //int n = 0; // 구해야 하는 정답 수
        for (int i = 0; i < 9; i++) {
             int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
             //n += Arrays.stream(tmp).filter(val->val==0).count();
             arr[i] = tmp;
        }
        br.close();
        // 함수
        sudoku(0,0);

    }
    public static void sudoku(int row,int col){
        if(col == 9) { // 0~8까지 돌았으면 0으로 시작
            sudoku(row + 1, 0);
            return;
        }if(row ==9) {// 정답을 찾았다면, 답을 1번만 출력해야하므로 출력 후 프로세스를 종료
            printAnswer();
            System.exit(0); // sudoku함수로 돌아가지않고, 프로세스 종료
        }
        // 핵심 로직
        if(arr[row][col]==0){
            for (int k = 1; k <= 9; k++) {
                if(isOK(row,col,k)) {
                    arr[row][col] = k;
                    sudoku(row,col+1);
                }
            }
            //  잘못된 답안으로 답이 나오지 않은 경우, 0으로 초기화 후 백트래킹
            arr[row][col] = 0;
            return;
        }
        sudoku(row,col+1);
    }
    public static boolean isOK(int row,int col,int k){
        // 해당 행에 k 검사
        for(int i=0;i<9;i++)
            if(arr[row][i]==k)
                return false;
        // 해당 열에 k 검사
        for(int i=0;i<9;i++)
            if(arr[i][col]==k)
                return false;
        // 해당 범위에 k 검사
        int n = (row/3)*3;
        int m = (col/3)*3;
        for(int i=n;i<n+3;i++)
            for(int j=m;j<m+3;j++)
                if(arr[i][j]==k)
                    return false;
        return true;
    }
    public static void printAnswer(){
        // 정답 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            sb.append(Arrays.toString(arr[i]).replaceAll("[^0-9 ]", "")).append("\n"); // 공백과 숫자빼고 제거
        }
        System.out.println(sb);
    }
}

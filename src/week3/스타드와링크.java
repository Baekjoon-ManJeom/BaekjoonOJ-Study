package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타드와링크 {
    static int N,ans=100;
    static int[][] arr;
    static boolean[] flag;
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // input N은 항상 짝수
        arr = new int[N][N];
        flag = new boolean[N];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        // 백트래킹
        /*
            두 팀으로 나누는 조합을 만드는게 시작이다.
            해당 조합별로 능력치의 합을 구하고 차이의 min값을 갱신해준다.
            백트래킹의 출구는 팀으로 골라진 명수가 n/2 지점일때 하는것(?)이겠지?
            필요한 매개변수는 A그룹 B그룹의 번호가 나눠지는 2가지 경우를 나누어 순회한다.
            나누는 경우는, boolean flag로 설정해주면 되겠다!.
            cnt가 n/2 지점일때, 나누는거 stop 하고 계산해주면되고! ok 감왔어
        */
        teamDiv(0,0);
        System.out.println(ans);
    }
    public static void teamDiv(int idx,int choice){
        if(N/2 == choice){
            PowerCheck();
            return;
        }
        for (int i = idx; i < N; i++) {
            if (!flag[i]) {
                flag[i] = true;
                teamDiv(idx + 1,choice+1);
                flag[i] = false;
            }
        }
    }
    public static void PowerCheck(){
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < N; i++) {
             for (int j = i+1; j < N; j++) {
                 if (flag[i] && flag[j])
                     sumA = sumA + arr[i][j] + arr[j][i];
                 else if (!flag[i] && !flag[j])
                     sumB = sumB + arr[i][j] + arr[j][i];
             }
        }
        ans = Math.min(ans, Math.abs(sumA -sumB));

        if(ans == 0){ // 최소값이 나왔다면 종료 (효율성을 위해)
            System.out.println(ans);
            System.exit(0);
        }
    }
}

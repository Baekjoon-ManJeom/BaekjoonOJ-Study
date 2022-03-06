import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon14888 {

    // int max 에 Integer.MAX_VALUE 를 해주는 이유를 체크해보자
    // 저 max 와 min 에 저 선언을 안해주면 오답으로 처리된다.
    static int[] operator = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] number;
    static int numberCount;

    public static void main(String args[])throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        numberCount = Integer.parseInt(br.readLine());
        number = new int[numberCount];
        st = new StringTokenizer(br.readLine(), " ");


        for(int i = 0 ; i < numberCount; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < 4 ; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        dfs(number[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int tmp, int count){

        if(count == numberCount){
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i] --;
                switch (i) {
                    case 0:
                        dfs(tmp + number[count], count + 1);
                        break;
                    case 1:
                        dfs(tmp - number[count], count + 1);
                        break;
                    case 2:
                        dfs(tmp * number[count], count + 1);
                        break;
                    case 3:
                        dfs(tmp / number[count], count + 1);
                        break;
                }
                operator[i]++;
            }
        }
    }
}
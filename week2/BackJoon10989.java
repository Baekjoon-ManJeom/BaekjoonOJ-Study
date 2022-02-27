import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BackJoon10989 {

    public static void main(String args[])throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxCount = Integer.parseInt(br.readLine());
        int maxNumber = 10000;
        int number;
        int l;
        int[] intCount = new int[maxNumber+1];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < maxCount ; i++){

            number = Integer.parseInt(br.readLine());
            intCount[number]++;
        }
        br.close();

        for(int k = 0; k <= maxNumber; k++){

            if(intCount[k]!=0){
                for(l=0 ; l<intCount[k] ; l++){
                    sb.append(k + "\n");
                }
            }

        }
        System.out.println(sb);

    }
}

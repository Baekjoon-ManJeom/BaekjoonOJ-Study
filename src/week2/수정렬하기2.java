package week2;


/*
 * 입력은 Scanner보다 BufferdReader를
 * 출력은 단순 for문 보다 StringBuilder로
 * 정렬은 Arrays.sort보다 Collections Sort를 사용하자
 *         Arrays 최악의 경우 n2이지만, Collections는 최악 nlogn을 보장한다
 * */

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class 수정렬하기2 {
    // 259,840kb	2576ms
    // Arrays.sort (문자열 그대로를 받아서 출력)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
            sb.append(br.readLine()).append(" ");
        br.close();
        Integer[] arr = Stream.of(sb.toString().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);
        sb = new StringBuilder();
        for (Integer i : arr)
            sb.append(i).append("\n");
        System.out.println(sb.toString());
    }
}*/


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class 수정렬하기2 {
    // 220,344kb	1668ms
    // StringBuilder + list
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(br.readLine()).append(" ");
        br.close();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(Stream.of(sb.toString().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new)));
        Collections.sort(list);
        sb = new StringBuilder();
        for (int i : list){ sb.append(i).append("\n");}
        System.out.println(sb.toString());
    }
}
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
public class 수정렬하기2 {
    // 2. TreeSet 자동정렬
    // 148,204kb	1816ms
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++)
            set.add(Integer.parseInt(br.readLine()));
        br.close();
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i : set){ sb.append(i).append("\n");}
        System.out.println(sb.toString());
    }
}





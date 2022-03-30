package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) throws IOException {
        // 깃 커밋이 왜 안되는거지냐고오오
        Queue<String> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        q.addAll(Arrays.asList(br.readLine().replaceAll("[^0-9,]", "")));

        System.out.println(q);
    }
}

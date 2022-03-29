package week7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        System.out.println(q);
    }
}

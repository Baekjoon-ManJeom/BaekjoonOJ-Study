package week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//  73,884kb ,740 ms
public class 나이순정렬 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] arr = new Person[n];
        for (int i = 0; i < n; i++){
            String tmp = br.readLine();
            arr[i] = new Person(Integer.parseInt(tmp.split(" ")[0]), tmp.split(" ")[1]);
        }
        br.close();
        // 정렬
        Arrays.sort(arr);
        // 출력
        StringBuilder sb = new StringBuilder();
        for (Person s: arr) {
            sb.append(s.age).append(" ").append(s.name).append("\n");
        }
        System.out.println(sb.toString());
    }
}
class Person implements Comparable<Person>{
    int age;
    String name;
    public Person(int age,String name) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}

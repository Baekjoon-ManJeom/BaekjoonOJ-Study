package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        // 정보 초기화
        Person[] persons = new Person[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int weigth = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            persons[i] = new Person(i,weigth,height);
        }
        // Grade 매기기
        Arrays.sort(persons, (o1, o2) -> o2.weigth - o1.weigth);// 몸무게 높은순
        persons[0].grade += 1;
        for(int i=0;i<N-1;i++) {
            if (persons[i].weigth == persons[i + 1].weigth)
                persons[i + 1].grade += persons[i].grade;
            else
                persons[i + 1].grade += i+2;
        }
        Arrays.sort(persons, (o1, o2) -> o2.height - o1.height);//키 높은순
        persons[0].grade += 1;
        for(int i=0;i<N-1;i++) {
            if (persons[i].height == persons[i + 1].height)
                persons[i + 1].grade += persons[i].grade;
            else
                persons[i + 1].grade += i+2;
        }
        Arrays.sort(persons, (o1, o2) -> o1.rank - o2.rank); //랭크값 낮은순
        persons[0].rank = 1;
        for(int i=1;i<N;i++) {
            if (persons[i-1].grade == persons[i].grade)
                persons[i].rank = persons[i-1].rank;
            else
               persons[i].rank = i+1;
        }
        // 결과 출력
        Arrays.sort(persons, (o1, o2) -> o1.i - o2.i); //낮은순
        for (Person person : persons) System.out.print(person.rank + " ");
    }
}
class Person{
    int i, weigth, height, grade=0, rank;
    public Person(int i, int weigth, int height) {
        this.i = i;
        this.weigth = weigth;
        this.height = height;
    }
}
/*
* 잘못된 접근을 했다. 키가 2등이건 5등이건, 그 사람이 등치 rank랑은 상관이 없었다;;
* 단순히 키랑 무게가 둘다 큰 사람은 큰걸로 간주하고, 비교가 애매하면 동 랭크였는데..
* */
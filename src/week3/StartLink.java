package week3;

import java.util.Scanner;

public class StartLink {
	
	public static int N;
	public static int[][] Smap;
	public static boolean[] pick;
	
	static int min = Integer.MAX_VALUE; //능력치 차이의 최솟값

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 
		N = sc.nextInt();
		pick = new boolean[N];
 
		Smap = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				Smap[i][j] = sc.nextInt();
			}
		}
		
		combi(0, 0);
		
		System.out.println(min); //최솟값 출력
		sc.close();
	}
	
	static void combi(int index, int count) {

		if(count == N / 2) { //팀 조합이 정해졌을 때 (방문한 팀, 방문하지 않은 팀)
			diff(); //각 점수를 조합해 최솟값 구하기
			return;
		}
 
		for(int i = index; i < N; i++) {
			if(!pick[i]) { //뽑히지 않았을때
				pick[i] = true;
				combi(i + 1, count + 1); //재귀 호출
				pick[i] = false;
			}
		}
	}
	
	static void diff() {
		int start = 0; //스타트팀
		int link = 0; //링크팀
 
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				//i와 j가 true인 팀일 때 스타트팀 점수 계산
				if (pick[i] == true && pick[j] == true) {
					start += Smap[i][j];
					start += Smap[j][i];
				}
				//i와 j가 true인 팀일 때 링크팀 점수 계산
				else if (pick[i] == false && pick[j] == false) {
					link += Smap[i][j];
					link += Smap[j][i];
				}
			}
		}
		
		int val = Math.abs(start - link); //두 팀의 점수차
		
		if (val == 0) { //점수차가 0이라면 종료
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
			
	}

}

package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* <알고리즘 구현 방식>
 1. dfs(각 연산자 개수 배열, 연산자 필요 수, 깊이) 를 구현
 2. visit 배열을 구성하여 CalCount 배열의 인덱스가 0이 아니면 false(방문하지 않은 것)으로 간주
 3. dfs가 중첩될 수록 깊이가 1씩 증가.
 4. 깊이가 입력받을 연산자 갯수와 같아지면 연산 배열을 사용하여 순서대로 연산.
 5. 깊이가 입력받을 연산자 갯수와 다르면 연산자 네가지를 tracking할 for(0~3)를 구성
 6. visit[i]이 false면 CalCount[i]를 1 감소시키고, 깊이를 1 증가 시킨뒤, dfs() 재귀 호출 
  
 
 
 */


public class Baekjoon14888 {
	
	public static int[] Operator; //입력받을 연산자 배열
	public static int[] Operand;	 // 피 연산 값 배열
	public static int Max = Integer.MIN_VALUE;
	public static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());		// 피연산자 개수 
		
		Operand = new int [N];
		int []CalCount = new int [4];	// 각 연산자 개수 배열
		Operator = new int [N-1];	// 입력받을 연산자 배열 -> 피연산자 개수 - 1 = 연산자 개수
		String line = br.readLine();
		for(int i = 0; i<N; i++) {
			Operand[i] = Integer.parseInt(line.split(" ")[i]);
		}
		
		line = br.readLine();
		for(int i = 0; i<4; i++) {

			CalCount[i] = Integer.parseInt(line.split(" ")[i]);
		}
		dfs(CalCount,N-1,0); // (각 연산자 개수 배열, 연산에 필요한 연산자 개수, 깊이)
		System.out.println(Max);
		System.out.println(Min);
	}

	public static void dfs(int []C, int M ,int depth) {	// depth는 현재까지 채워진 연산자 수

		boolean []visit = new boolean[4];

		for(int i = 0; i<4; i++) {				// C[]를 통해 방문 여부를 파악
			if(C[i]==0) visit[i]= true;
			else visit[i]= false;
		}

		//배열에 필요한 연산자를 다 채웠으므로 출력. 
		if(depth==M) {
			int sum = Operand[0];
			for(int i = 0 ; i<Operator.length; i++) {
				int j = i+1;
				if(Operator[i]==0) sum += Operand[j];			// 0 -> +
				else if(Operator[i]==1) sum -= Operand[j];		// 1 -> -
				else if(Operator[i]==2) sum *= Operand[j];		// 2 -> *
				else if(Operator[i]==3) sum /= Operand[j];		// 3 -> /
				
//				return;
			}
			if(sum<Min) Min = sum; 		//다양한 sum의 경우의 수에서 최솟값 도출
			if(sum>Max) Max = sum; 		//다양한 sum의 경우의 수에서 최댓값 도출
			
			
		}



		for(int i = 0; i<4; i++ ) {
			if(!visit[i]) { // 방문을 안했다 -> false 
				C[i]-=1;		// 사용된 연산자를 배열의 인덱스에서 하나씩 제외
				Operator[depth] = i;	//출력할 배열에 해당 값을 저장
				dfs(C,M,depth+1);		//깊이를 증가시켜서 dfs를 재귀 호출
				C[i]+=1;				//재귀가 끝나고 C[i]를 원복시키고 다시 트래킹
			}


		}
	}


}



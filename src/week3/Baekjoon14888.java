package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* <�˰��� ���� ���>
 1. dfs(�� ������ ���� �迭, ������ �ʿ� ��, ����) �� ����
 2. visit �迭�� �����Ͽ� CalCount �迭�� �ε����� 0�� �ƴϸ� false(�湮���� ���� ��)���� ����
 3. dfs�� ��ø�� ���� ���̰� 1�� ����.
 4. ���̰� �Է¹��� ������ ������ �������� ���� �迭�� ����Ͽ� ������� ����.
 5. ���̰� �Է¹��� ������ ������ �ٸ��� ������ �װ����� tracking�� for(0~3)�� ����
 6. visit[i]�� false�� CalCount[i]�� 1 ���ҽ�Ű��, ���̸� 1 ���� ��Ų��, dfs() ��� ȣ�� 
  
 
 
 */


public class Baekjoon14888 {
	
	public static int[] Operator; //�Է¹��� ������ �迭
	public static int[] Operand;	 // �� ���� �� �迭
	public static int Max = Integer.MIN_VALUE;
	public static int Min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());		// �ǿ����� ���� 
		
		Operand = new int [N];
		int []CalCount = new int [4];	// �� ������ ���� �迭
		Operator = new int [N-1];	// �Է¹��� ������ �迭 -> �ǿ����� ���� - 1 = ������ ����
		String line = br.readLine();
		for(int i = 0; i<N; i++) {
			Operand[i] = Integer.parseInt(line.split(" ")[i]);
		}
		
		line = br.readLine();
		for(int i = 0; i<4; i++) {

			CalCount[i] = Integer.parseInt(line.split(" ")[i]);
		}
		dfs(CalCount,N-1,0); // (�� ������ ���� �迭, ���꿡 �ʿ��� ������ ����, ����)
		System.out.println(Max);
		System.out.println(Min);
	}

	public static void dfs(int []C, int M ,int depth) {	// depth�� ������� ä���� ������ ��

		boolean []visit = new boolean[4];

		for(int i = 0; i<4; i++) {				// C[]�� ���� �湮 ���θ� �ľ�
			if(C[i]==0) visit[i]= true;
			else visit[i]= false;
		}

		//�迭�� �ʿ��� �����ڸ� �� ä�����Ƿ� ���. 
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
			if(sum<Min) Min = sum; 		//�پ��� sum�� ����� ������ �ּڰ� ����
			if(sum>Max) Max = sum; 		//�پ��� sum�� ����� ������ �ִ� ����
			
			
		}



		for(int i = 0; i<4; i++ ) {
			if(!visit[i]) { // �湮�� ���ߴ� -> false 
				C[i]-=1;		// ���� �����ڸ� �迭�� �ε������� �ϳ��� ����
				Operator[depth] = i;	//����� �迭�� �ش� ���� ����
				dfs(C,M,depth+1);		//���̸� �������Ѽ� dfs�� ��� ȣ��
				C[i]+=1;				//��Ͱ� ������ C[i]�� ������Ű�� �ٽ� Ʈ��ŷ
			}


		}
	}


}



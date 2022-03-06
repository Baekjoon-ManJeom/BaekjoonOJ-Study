package week3;

import java.util.Scanner;

public class StartLink {
	
	public static int N;
	public static int[][] Smap;
	public static boolean[] pick;
	
	static int min = Integer.MAX_VALUE; //�ɷ�ġ ������ �ּڰ�

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
		
		System.out.println(min); //�ּڰ� ���
		sc.close();
	}
	
	static void combi(int index, int count) {

		if(count == N / 2) { //�� ������ �������� �� (�湮�� ��, �湮���� ���� ��)
			diff(); //�� ������ ������ �ּڰ� ���ϱ�
			return;
		}
 
		for(int i = index; i < N; i++) {
			if(!pick[i]) { //������ �ʾ�����
				pick[i] = true;
				combi(i + 1, count + 1); //��� ȣ��
				pick[i] = false;
			}
		}
	}
	
	static void diff() {
		int start = 0; //��ŸƮ��
		int link = 0; //��ũ��
 
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				//i�� j�� true�� ���� �� ��ŸƮ�� ���� ���
				if (pick[i] == true && pick[j] == true) {
					start += Smap[i][j];
					start += Smap[j][i];
				}
				//i�� j�� true�� ���� �� ��ũ�� ���� ���
				else if (pick[i] == false && pick[j] == false) {
					link += Smap[i][j];
					link += Smap[j][i];
				}
			}
		}
		
		int val = Math.abs(start - link); //�� ���� ������
		
		if (val == 0) { //�������� 0�̶�� ����
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
			
	}

}

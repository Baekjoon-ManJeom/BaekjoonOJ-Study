package week1;

import java.util.Scanner;

public class size {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][2]; 
		
		for(int i=0; i<n; i++) { //������ �迭�� ��ĵ
			arr[i][0] = sc.nextInt(); //������
			arr[i][1] = sc.nextInt(); //Ű
		}
		
		for(int i=0; i<n; i++) {
			
			int rank = 1; //��� 1������ �ʱ�ȭ
			
			for(int j=0; j<n; j++) {
				
				if(i != j) { //�� ����� ���� ���� ��
					
					if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { //i�� j���� ��ġ�� ������
						rank++; //����� �ϳ� �з���
					}
				}
			}
			
			System.out.print(rank + " ");
			sc.close();
		}
	}

}

package week1;

import java.util.Scanner;

public class size {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][2]; 
		
		for(int i=0; i<n; i++) { //이차원 배열에 스캔
			arr[i][0] = sc.nextInt(); //몸무게
			arr[i][1] = sc.nextInt(); //키
		}
		
		for(int i=0; i<n; i++) {
			
			int rank = 1; //등수 1등으로 초기화
			
			for(int j=0; j<n; j++) {
				
				if(i != j) { //비교 대상이 같지 않을 때
					
					if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { //i가 j보다 덩치가 작으면
						rank++; //등수가 하나 밀려남
					}
				}
			}
			
			System.out.print(rank + " ");
			sc.close();
		}
	}

}

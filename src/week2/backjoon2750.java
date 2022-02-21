package week2;
import java.util.Arrays;
import java.util.Scanner;

public class backjoon2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []t = new int[n];
		for(int i = 0; i<n ; i++) {
			t[i]=in.nextInt();
		}

		/*1. 정렬 함수 사용*/
		//		Arrays.sort(t);

		/*2. 선택 정렬 */
//		int min = t[0];
//		for(int i =0;i<n-1; i++) {		// 1번 인덱스부터 다른 인덱스와 비교하며 최솟값 바꾼다.
//			for(int j =0+i;j<n; j++) {
//			if(t[i]>t[j]) {
//				
//				int temp = 0;
//				temp = t[i];
//				t[i] = t[j];
//				t[j] = temp;
//				
//			}
//		}		
//		}
		/* 3. 삽입 정렬 */
		
//		for(int i =1;i<n; i++) {		
//			int tg = t[i];			// 2번째 인덱스부터 기준을 삼는다
//			int j = i - 1;
//			
//			while(j>=0 && tg<t[j]) {	// 타겟을 기준으로 인접한 왼쪽 인덱스들을 순서대로 비교하며  
//				t[j+1] = t[j];			//앞의 원소가 더 크면 타겟을 왼쪽에 삽입하고 나머지를 오른쪽으로 밀어낸다.
//				j--;
//			}
//		
//			t[j+1] = tg;		// while을 탈출했을때 j는 0이거나, 타겟보다 작다는 의미이다.
//								// 따라서 타겟은 j+1번째에 와야한다.
//		}
	
		/* 4. 버블 정렬 */
		for(int j = n; j>1; j--) {
			for(int i =0;i<n-1; i++) {	
				if(t[i]>t[i+1]) {			//인접한 두수를 비교해 자리를 바꾼다.
					int temp = t[i+1];		//한 싸이클마다 최댓값이 고정된다
					t[i+1] =t[i];
					t[i] = temp;
				}
			}
		}
		for(int x : t) {
		System.out.println(x);
		}
	}
		
}

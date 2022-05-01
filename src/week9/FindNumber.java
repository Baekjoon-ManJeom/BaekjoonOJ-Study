package week9;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
	
	/* 이분탐색
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        
        Arrays.sort(arr); //수 정렬
        
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int st = 0;
            int en = arr.length - 1;
            boolean flag = false;
            
            while (st <= en) {
                int mid = (st + en) / 2;

                if (arr[mid] > num) {
                    en = mid - 1;
                } else if (arr[mid] < num) {
                    st = mid + 1;
                } else { //arr[mid] = num
                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            if (!flag) {
                System.out.println(0);
            }
        }
        sc.close();
	}

}

package week9;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
	
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
            int key = sc.nextInt();
            int st = 0;
            int en = arr.length - 1;
            boolean flag = false;
            
            while (st <= en) {
                int mid = (st + en) / 2;

                if (arr[mid] > key) { //key값이 중간 값보다 작을 때
                    en = mid - 1;
                } else if (arr[mid] < key) { //key값이 중간 값보다 클 때
                    st = mid + 1;
                } else { //arr[mid] = num 값을 찾았을 때
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

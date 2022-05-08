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
        
        Arrays.sort(arr); //�� ����
        
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            int st = 0;
            int en = arr.length - 1;
            boolean flag = false;
            
            while (st <= en) {
                int mid = (st + en) / 2;

                if (arr[mid] > key) { //key���� �߰� ������ ���� ��
                    en = mid - 1;
                } else if (arr[mid] < key) { //key���� �߰� ������ Ŭ ��
                    st = mid + 1;
                } else { //arr[mid] = num ���� ã���� ��
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

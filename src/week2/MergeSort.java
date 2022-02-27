package week2;

import java.util.Scanner;

/* ���� ���� �˰���
   �ð� �ʰ���.. */

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] temp = new int[n];
		mergeSort(arr, temp, 0, n-1); //���ȣ��
		
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}
	
	private static void mergeSort(int[] arr, int[] temp, int left, int right) {
		if(left < right) { //��ġ�� ��ġ�� ���� ��
			
			int mid = (left+right)/2;
			
			mergeSort(arr, temp, left, mid); //�迭�� ����
			mergeSort(arr, temp, mid+1, right); //�迭�� ����
			merge(arr, temp, left, mid, right); //����
		}
	}
	
	private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
		int curr1 = left; //ù��° �迭 ��ġ
		int curr2 = mid+1; //�ι�° �迭 ��ġ
		int index = left; //���������� ����Ǵ� �迭 ��ġ
		
		for(int i=left; i<=right; i++) {
			temp[i] = arr[i]; //�ӽ� �迭�� ����
		}
		
		while(curr1<=mid && curr2<=right) {
			if(temp[curr1] <= temp[curr2]) {
				arr[index] = temp[curr1]; //ù��° �迭�� ���� ������
				curr1++;
			}else {
				arr[index] = temp[curr2]; //�ι�° �迭�� ���� ������
				curr2++;
			}
			index++;
		}
		for (int i=0; i<=mid-curr1; i++) { //ù��° �迭 ���� ������ �� �ڿ� �ٿ��ֱ�
			arr[index+i] = temp[curr1+i];
		}
	}

}

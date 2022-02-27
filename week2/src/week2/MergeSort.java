package week2;

import java.util.Scanner;

/* 병합 정렬 알고리즘
   시간 초과남.. */

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
		mergeSort(arr, temp, 0, n-1); //재귀호출
		
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}
	
	private static void mergeSort(int[] arr, int[] temp, int left, int right) {
		if(left < right) { //위치가 겹치지 않을 때
			
			int mid = (left+right)/2;
			
			mergeSort(arr, temp, left, mid); //배열의 좌측
			mergeSort(arr, temp, mid+1, right); //배열의 우측
			merge(arr, temp, left, mid, right); //병합
		}
	}
	
	private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
		int curr1 = left; //첫번째 배열 위치
		int curr2 = mid+1; //두번째 배열 위치
		int index = left; //최종적으로 저장되는 배열 위치
		
		for(int i=left; i<=right; i++) {
			temp[i] = arr[i]; //임시 배열에 복사
		}
		
		while(curr1<=mid && curr2<=right) {
			if(temp[curr1] <= temp[curr2]) {
				arr[index] = temp[curr1]; //첫번째 배열의 수가 작을때
				curr1++;
			}else {
				arr[index] = temp[curr2]; //두번째 배열의 수가 작을때
				curr2++;
			}
			index++;
		}
		for (int i=0; i<=mid-curr1; i++) { //첫번째 배열 수가 남았을 때 뒤에 붙여주기
			arr[index+i] = temp[curr1+i];
		}
	}

}

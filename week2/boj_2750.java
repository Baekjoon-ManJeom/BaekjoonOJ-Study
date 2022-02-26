import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    quickSort(arr, 0, n-1);
    for(int i=0;i<n;i++) {
      bw.write(arr[i]+"\n");
    }
    br.close();
    bw.close();
  }
  public static void quickSort(int arr[],int left,int right) {
    if(left<right) {
        //피벗을 중앙에 더빠른 퀵소트 과속알고리즘
      int pivot = arr[(left+right)/2];
      int i=left-1,j=right+1;
      while(true) {
        while(arr[++i]<pivot);
        while(arr[--j]>pivot);
        if(i>=j)break;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
      quickSort(arr, left, i-1);
      quickSort(arr, j+1, right);
    }
  }
}

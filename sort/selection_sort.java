package sort;

public class selection_sort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        for (int i=0;i<arr.length-2;i++){
            int minPos = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp ; 
        }
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int num : arr ){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

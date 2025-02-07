package sort;

public class bubble_sort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        for (int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
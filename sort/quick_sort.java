package sort;

import java.util.Arrays;

public class quick_sort {

    public static void q_sort(int[] arr , int low , int high){
        if(low<high){
            int pivotIndex = partition(arr , low ,high);
            q_sort(arr , low , pivotIndex-1);
            q_sort(arr , pivotIndex+1 , high);
        }
    }

    public static int partition(int[] arr , int low , int high){
            int pivot = arr[low];
            int i = low ;
            int j = high ; 
    
            do{
                do{
                    i++;
                }while(i<=high && arr[i] < pivot);
    
                do{
                    j--;
                }while(j>low && arr[j] > pivot);
    
                if(i<j){
                    arr[i] = arr[i] + arr[j] ; 
                    arr[j] = arr[i] - arr[j] ; 
                    arr[i] = arr[i] - arr[j] ;
                }
            }while(i<j);

            if(low!=j){
                arr[low] = arr[low] + arr[j] ; 
                arr[j] = arr[low] - arr[j] ; 
                arr[low] = arr[low] - arr[j] ; 
            }
            return j ; 
        }
    
        public static void main(String[] args) {
            int[] arr = {10,16,8,12,15,6,3,9,5};
            q_sort(arr  , 0 , arr.length -1);
            System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

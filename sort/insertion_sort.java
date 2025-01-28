package sort;

public class insertion_sort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        
        for(int i=1 ; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            //if prev value is more than hand element then push prev element ahead to have space to insert new element
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev --;
            }

            //now we have space to insert as prev element<current element to insert hand element in front of prev element
            arr[prev+1] = curr;

        }printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int num : arr ){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

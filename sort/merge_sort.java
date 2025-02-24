package sort;

public class merge_sort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int si = 0 ; 
        int ei = arr.length-1;

        merge_s(arr, si ,ei);
        printArr(arr);
    }

    public static void merge_s(int arr[] , int si , int ei){

        if(si >= ei){
            return ; 
        }

        int mid = (si + ei) / 2 ; 
        merge_s(arr , si , mid);  //left
        merge_s(arr , mid+1 , ei);  //right
        merge(arr , si , ei , mid); //meger both
    }

    public static void merge(int arr[] , int si , int ei , int mid){

        int temp[] = new int[ei - si + 1];
        int i = si ; 
        int j = mid+1;
        int k = 0 ; 

        while(i <= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        
        //copy to main array
        for(k=0 , i=si ; i<=ei ; i++ , k++){
            arr[i] = temp[k];
        }
    }
}

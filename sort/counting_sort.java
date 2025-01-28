package sort;

public class counting_sort {
    public static void main(String args[]){

        int arr[] = {1,2,1,3,4,2,3,4,1,2};
        //find the largest
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        } 

        //iterate arr and count numbers
        int count[] = new int[largest+1];
        for (int i=0 ; i<arr.length ;i++){
            count[arr[i]]++; //use arr[i] as index to add count of that number
        }

        //sort
        int j =0;
        for(int i=0 ; i<count.length;i++){
            while(count[i]>0){
                arr[j] = i; //modify the og array
                j++;  //add to next index
                count[i]--; //decrese the count as the nuymber is inserrted

            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int num : arr ){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

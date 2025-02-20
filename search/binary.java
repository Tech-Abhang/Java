package search;
public class binary {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 20;
        int index = bsearch(numbers,key);
        System.out.println("index of key is " + index);
    }

    
    public static int bsearch(int numbers[],int key){
        int start = 0 , end = numbers.length - 1;

        while (start <= end){
            int mid = (start + end)/2;

            //compare
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ //right
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
//checking commit



//prefix sum O(n2)

public class sum2 {
    public static void main(String args[]){
        int currSum  = 0;
        int maxSum = 0;
        int arr[] = {2,4,6,8,10};
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for (int i =0 ; i<arr.length;i++){ 
            int start = i;
            for (int j = i;j<arr.length;j++){
                int end = j;
                currSum  = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
            }

            if(maxSum < currSum){
                maxSum = currSum;
            }    
        }
        System.out.println("max sum is :" + maxSum);
    }
}

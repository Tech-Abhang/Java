//brute force O(n3)

public class sum {
    public static void main(String args[]){
        int maxSum = 0;
        int arr[] = {2,4,6,8,10};
        for (int i =0 ; i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                int currSum = 0 ;
                for (int k = i ; k<=j;k++){
                    currSum = currSum + arr[k]; 
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum ; 
                }
            }System.out.println();
        }
        System.out.println("max sum is : "+maxSum);
    }
}

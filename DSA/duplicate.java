package DSA;

public class duplicate {
    public static boolean main(int[] args) {
        int nums[] = {1,2,3,1};
        for (int i=0 ; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ;j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

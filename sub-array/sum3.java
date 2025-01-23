//kadans algorithm O(n)
public class sum3 {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int ms = 0;
        int cs = 0;

        for (int i = 0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
    }
}

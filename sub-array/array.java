//n array has n(n+1)/2 elements

public class array {
    int total =0 ;
    public static void main(String args[]){
        int total = 0;
        int arr[] = {2,4,6,8,10};
        for (int i =0 ; i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                for (int k = i ; k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                total = total +1;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub-arrays "+ total);
    }
}

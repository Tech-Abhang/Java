public class diagonal_sum {
    public static int diaSum(int matrix[][]){
        int sum=0;

        //time complexity O(n2)

        // for(int i=0 ; i<matrix.length ; i++){
        //     for(int j=0 ; j<matrix[0].length ; j++){
        //         if(i == j){
        //             sum = sum + matrix[i][j] ; 
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum = sum + matrix[i][j] ; 
        //         }
        //     }
        // }

        //time complexity O(n)

        for(int i=0 ; i<matrix.length;i++){
            //pd
            sum += matrix[i][i] ; //pd mai i == j

            //sd
            //if condn to avoid adding middle element where i==j
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i] ; //i+j==matrix.lenght-1 hence j == 
            }
            
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        diaSum(matrix);
    }
}

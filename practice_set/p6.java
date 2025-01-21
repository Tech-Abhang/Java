// import java.util.*;
// public class p6 {
//     public static void main(String args[]){
//         int marks[] = {99,99,99};
//         Scanner sc = new Scanner(System.in);
//         int nonChange = 5;
//         update(marks,nonChange);

//         for (int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+ " ");;
//         }
//         System.out.println(nonChange);

//     }

//     public static void update(int marks[],int nonChange){
//         for (int i=0;i<marks.length;i++){
//             marks[i] = marks[i] +1;
//         }
//         nonChange = 10;
        
//     }
// }

//find the largest element
public class p6 {
    public static int getLargest(int numbers[]){
        int largest = numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {1,2,6,4,5};
        int largestNum= getLargest(numbers);
        System.out.println(largestNum);
    }
}
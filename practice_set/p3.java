// //sum of n natural numbers
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i=1;
//         int sum = 0;
//         while (i<=n){
//             sum +=i;
//             i++;
//         }
//         System.out.print(sum);
//     }
// }

// //square pattern
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int cols = sc.nextInt();
//         int rows = sc.nextInt();
//         for (int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print("*");
//             }System.out.println("");
//         }
//     }
// }

// //reverse a number
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int newNum = 0;
//         while(num>0){
//             int lastDigit = num%10;
//             newNum = newNum *10 + lastDigit;
//             num /=10;
//         }
//         System.out.print(newNum);
//     }
// }

// //input user nuber except multiple of 10
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         while(true){
//             int n = sc.nextInt();
//             if (n%10==0){
//                 break;
//             }
//         }
//     }
// }

// //skip 3 between 1 to 10
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<5;i++){
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// //user input numbers but if multiple of 10 the skip for 5 times
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int i =0;
//         while(i<5){
//             System.out.print("enter number:");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 continue;
//             }
//             System.out.println("entered number is" + n);
//             i++;
//         }
//     }
// }

// //check prime

// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 isPrime = false;
//             }
//         }
//         if (isPrime==true){
//             System.out.print("n is prime");
//         }else{
//             System.out.print("n is not prime");
//         }
//     }
// }

// //print sum of even or odd nunmbers
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum_o=0;
//         int sum_e=0;
//         for(int i=0;i<=n;i++){
//             if(i%2==0){
//                 sum_e +=i;
//             }else{
//                 sum_o +=i;
//             }
//         }
//         System.out.println("sum of even numbers:"+sum_e);
//         System.out.println("sum of odd numbers:"+sum_o);
//     }
// }

// //factorial
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i=2;i<=n;i++){
//             fact *=i;
//         }
//         System.out.println(fact);
//     }
// }

//multiplication table 
import java.util.*;
public class p3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=10;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}

//functions
// import java.util.*;
// public class p5{

//     public static int sum(int a , int b){  //parameters or formal parameters
//         int sum = a+b;
//         return sum;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = sum(a,b); //arguments or actual parameters
//         System.out.print(sum);
//         sc.close();
//     }
// }

//factorial
// import java.util.*;
// public class p5{

//     public static int fact(int a){  //parameters or formal parameters
//         int fact = 1;
//         for(int i=1;i<=a;i++){
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int factorial = fact(a); //arguments or actual parameters
//         System.out.print(factorial);
//         sc.close();
//     }
// }

//binomial coefficient
// import java.util.*;
// public class p5{

//     public static int fact(int n){  //parameters or formal parameters
//         int fact = 1;
//         for(int i=1;i<=n;i++){
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static int bino_cof(int n,int r){
//         int n_fact = fact(n);
//         int r_fact = fact(r); 
//         int nr_fact = fact(n-r);
//         int bino = n_fact/(r_fact*nr_fact);
//         return bino;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         int bino_cof = bino_cof(n,r);
//         System.out.print(bino_cof);
//         sc.close();
//     }
// }

//prime or not
// import java.util.*;
// public class p5{

//     public static boolean prime(int n){  //parameters or formal parameters
//         boolean isPrime = true;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if (n%i==0){
//                 isPrime = false;
//             }
//         }
//         return isPrime;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isPrime = prime(n);
//         if (isPrime == true){
//             System.out.print("is prime");
//         }else{
//             System.out.print("not prime");
//         }
//         sc.close();
//     }
// }

//prime prime number in range
import java.util.*;
public class p5{

    public static void primeRange(int n){  //parameters or formal parameters
        for(int i =0 ; i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeRange(n);
        sc.close();
    }
}
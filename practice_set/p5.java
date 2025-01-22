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
// import java.util.*;
// public class p5{

//     public static void primeRange(int n){  //parameters or formal parameters
//         for(int i =0 ; i<=n;i++){
//             boolean isPrime = true;
//             for(int j=2;j<=Math.sqrt(i);j++){
//                 if (i%j==0){
//                     isPrime = false;
//                 }
//             }
//             if (isPrime == true){
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         primeRange(n);
//         sc.close();
//     }
// }

//binary to decimal
// import java.util.*;
// public class p5{

//     public static void btd(int a){
//         int pow = 0;
//         int decimal = 0;
//         while(a>0){
//             int lastDigit = a%10;
//             decimal = decimal + (lastDigit * (int)Math.pow(2,pow));
//             pow ++;
//             a = a/10;
//         }
//         System.out.print(decimal);
        
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         btd(a);
//         sc.close();
//     }
// }

// decimal to binary
// import java.util.*;
// public class p5{

//     public static void dtb(int a){
//         int pow = 0;
//         int binary = 0;
//         while(a>0){
//             int rem = a%2;
//             binary = binary + (rem * (int) Math.pow(10,pow));
//             pow ++;
//             a = a/2;
//         }
//         System.out.print(binary);
        
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         dtb(a);
//         sc.close();
//     }
// }

//avg of 3 numbers


// import java.util.*;
// public class p5{
//     public static void avg(int a,int b,int c){
//         int avg = (a+b+c)/3;
//         System.out.println(avg);
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         avg(a,b,c);
//         sc.close();
//     }
// }


//check even or odd
// import java.util.*;
// public class p5{
//     public static boolean isEven(int a){
//         if(a%2==0){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(isEven(a)){
//             System.out.println("its even");
//         }else{
//             System.out.println("its odd");
//         }
//         sc.close();
//     }
// }


//palindrome number
// import java.util.*;
// public class p5{
//     public static boolean palindrome(int a){
//         int reverse = 0;
//         while(a !=0){
//             int remainder = a % 10;
//             reverse = reverse * 10 + remainder ; 
//             a = a/10;
//         }
//         if(a == reverse){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         palindrome(a);
//         if(palindrome(a)){
//             System.out.println("its palindrome");
//         }else{
//             System.out.println("its palindrome");
//         }
//         sc.close();
//     }
// }

//sum of digits of integer
import java.util.*;
public class p5{
    public static int sumofdigits(int num){
        int sum = 0;
        int lastDigit = 0;
        while(num>0){
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumod = sumofdigits(n);
        System.out.println(sumod);

    }
}
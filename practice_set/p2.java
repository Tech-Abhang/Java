//find larger value 

// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a>b){
//             System.out.println("a is greater than b");
//         }else{
//             System.out.println("b is greater than a");
//         }
//     }
// }

//odd or even

// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if (a%2==0){
//             System.out.println("a is divisible by 2");
//         }else{
//             System.out.println("a is not divisible by 2");
//         }
//     }
// }

//income tac calculator

// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;
//         if (income<500000){
//             tax =0;
//             System.out.println("tax :" + tax);
//         }else if (income>500000 && income<100000){
//             tax=(int)0.2;
//             System.out.println("tax :" + tax);
//         }else{
//             tax=(int)0.3;
//             System.out.println("tax :" + tax);
//         }
//     }
// }

//largest 3 numbers
// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if (a>b && a>c){
//             System.out.println("a is largest");
//         }
//         else if (b>c && b>a){
//             System.out.println("b is largest");
//         }
//         else{
//             System.out.println("c is largest");
//         }
//     }
// }

// pass or fail

// import java.util.*;
// public class p2{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();
//         String report = (marks>33)?"pass":"fail";
//         System.out.println(report);
        
//     }
// }

//calculator

import java.util.*;
public class p2{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        System.out.print("enter operator : ");
        int operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:{
                System.out.println("calculator doesnot perform this operation");
            }
        }
    }
}
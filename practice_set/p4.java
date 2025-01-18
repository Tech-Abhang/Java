// //half pyramid
// import java.util.*;
// public class p4{
//     public static void main(String arg[]){
//         Scanner sc= new Scanner(System.in);
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println("");
//             sc.close();
//         }
//     }
// }

//char pattern

// //half pyramid
// import java.util.*;
// public class p4{
//     public static void main(String arg[]){
//         Scanner sc= new Scanner(System.in);
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println("");
//             sc.close();
//         }
//     }
// }

// //inverted half-pyramid
// import java.util.*;
// public class p4{
//     public static void main(String arg[]){
//         Scanner sc= new Scanner(System.in);
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=(5-i+1);j++){
//                 System.out.print(j);
//             }
//             System.out.println("");
//             sc.close();
//         }
//     }
// }

//floyd's triangle
// import java.util.*;
// public class p4{
//     public static void main(String arg[]){
//         Scanner sc= new Scanner(System.in);
//         int n = 0;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 n += 1;
//                 System.out.print(n);
                
//             }
//             System.out.println("");
//             sc.close();
//         }
//     }
// }

//hollow rectangle
// public class p4{
//     public static void hollow_rect(int totRows , int totCols){
//         //outer loop
//         for (int i=1;i<=totRows;i++){
//             //inner loop
//             for(int j=1;j<=totCols;j++){
//                 //cell - (i,j)
//                 if(i==1 || i==totRows || j==1 ||j==totCols){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollow_rect(4,5);
//     }
// }

//inverted rotated half-pyramid
public class p4{
        public static void irhp(int n){
            //lines
            for (int i=1; i<=4;i++){
                //spaces
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            irhp(4);
        }
    }
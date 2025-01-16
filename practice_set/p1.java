// // input 3 numbers find avg

// import java.util.*;
// public class p1{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         float avg = (a + b + c)/3;
//         System.out.print(avg);
//     }
// }

// //input side of square and output is area

// import java.util.*;
// public class p1{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         float side = sc.nextFloat();
//         float area = side*side;
//         System.out.print(area);
//     }
// }

//enter cost of 3 item by user and output total cost + 18%gst

import java.util.*;
public class p1{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser = sc.nextInt();
        int sum = pen + pencil + eraser ;
        float cost = sum + 18/100f*sum;
        System.out.print(cost);
        sc.close();
    }
}

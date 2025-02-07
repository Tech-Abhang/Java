//bitwise operators

//get ith bit
// import java.util.*;
// public class p7 {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int num = sc.nextInt();
//             int bitnum = 1;
//             int i = sc.nextInt();
//             if((num & (bitnum<<i)) == 0){
//                 System.out.println(0);
//             }else{
//                 System.out.println(1);
//             }
//         }
// }

//set ith bit 
// import java.util.*;
// public class p7 {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int num = sc.nextInt();
//             int bitnum = 1;
//             int i = sc.nextInt();
//             if((num | (bitnum<<i)) == 0){
//                 System.out.println(0);
//             }else{
//                 System.out.println(1);
//             }
//         }
// }

//clear ith bit
import java.util.*;
public class p7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int bitnum = 1;
            int i = sc.nextInt();
            System.out.println(num | bitnum<<i);
            sc.close();
        }
}
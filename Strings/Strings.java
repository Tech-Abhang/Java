//palindrome number
// package Strings;

// public class Strings {
//     public static boolean isPalindrome(String str){
//         for (int i=0 ; i<str.length() ; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.print(isPalindrome(str));
//     }
// }

//route shortest path

// package Strings;

// public class Strings {
//     public static float shortestPath(String str){
//         int x =0 ;
//         int y =0 ; 
//         for (int i=0 ; i<str.length() ; i++){
//             char dir = str.charAt(i);

//             if(dir == 'S'){
//                 y--;
//             }

//             if(dir == 'N'){
//                 y++;
//             }

//             if(dir == 'E'){
//                 x++;
//             }

//             if(dir == 'W'){
//                 x--;
//             }
//         }

//         return (float)Math.sqrt(x*x + y*y) ;
//     }

//     public static void main(String[] args) {
//         String str = "WEWEWENSN";
//         System.out.print(shortestPath(str));
//     }
// }

//legicographically compare strings

package Strings;

public class Strings {
    public static void main(String[] args) {
        String arr[] = {"apple" , "banana" , "mango"};

        String largest = arr[0];
        for (int i=1 ; i<arr.length ; i++){
            if(largest.compareTo(arr[i])<0){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}



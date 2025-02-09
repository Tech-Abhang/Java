//print n to 1 
package recursion;

public class practice_re {
    public static void printnum(int n){
        //base case to avoild overlowing
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n + "");
        printnum(n-1);
    }

    public static void main(String args[]){
        int i = 10 ; 
        printnum(i);
    }
}

//print n to 1 
package recursion;

public class practice_re {

    //print n to 1 
    public static void printnum(int n){
        //base case to avoild overlowing
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n + "");
        printnum(n-1);
    }

    //print 1 to n
    public static void inc(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        inc(n-1);
        System.out.println(n);

    }

    //sum n natrual numbers
    public static int sumofn(int n) {
        if(n==1){
            return 1;
        }
        return n + sumofn(n-1);
    }

    //fibonacci series
    public static int fibo(int n){
        //base case
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2) ; 
    }

    public static void main(String args[]){
        int i = 25 ;
        System.out.println(fibo(i));
    }
}

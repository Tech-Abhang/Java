//print 1 to n 
package recursion;

public class p2 {
    public static void inc(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        inc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int i = 10 ; 
        inc(i);
    }
}

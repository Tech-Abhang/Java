import java.util.*;
public class p6 {
    public static void main(String args[]){
        int marks[] = {99,99,99};
        Scanner sc = new Scanner(System.in);
        int nonChange = 5;
        update(marks,nonChange);

        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");;
        }
        System.out.println(nonChange);

    }

    public static void update(int marks[],int nonChange){
        for (int i=0;i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
        nonChange = 10;
        
    }
}

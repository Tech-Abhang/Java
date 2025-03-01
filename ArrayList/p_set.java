package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class p_set {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        //reverse array
        for(int i=list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i) + " ");
        }

        //max
        int max= Integer.MIN_VALUE;
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        //swap two numbers
        int idx1 = 1 ; int idx2 = 2;
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx1));
        list.set(idx2 , temp);

        //sort
        //asending
        Collections.sort(list);

        //decending
        Collections.sort(list,Collections.reverseOrder());

        //2D arraylist
        ArrayList<ArrayList <Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1) ; list1.add(2); list1.add(3) ; 
        mainList.add(list1);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(2);list2.add(4);list2.add(6);
        mainList.add(list2);

        for (int i=0 ; i<mainList.size();i++){
            ArrayList <Integer> currList = mainList.get(i);
            for(int j=0 ; j<currList.size() ; j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}

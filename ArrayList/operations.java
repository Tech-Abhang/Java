package ArrayList;

import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
    // //add
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);

    list.add(2,10); //at index 2 addes element 10

    //get
    int ele = list.get(2); //index=2
    System.out.println(ele);

    //remove
    list.remove(2); //index=2
    System.out.println(list);

    //set
    list.set(2,10); //2nd index replace element 10
    System.out.println(list);

    //contains
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));

    //size
    System.out.println(list.size());

    }

}

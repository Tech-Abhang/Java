package Stack;

import java.util.ArrayList;

public class StackEx {
    public static void main(String[] args) {
        Stack s = new Stack() ; 
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    static class Stack{
        static ArrayList <Integer> list = new ArrayList<>();
        
        public static boolean isEmpty(){
            return list.size() == 0 ; 
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            int top = list.size()-1;
            int top_v = list.get(top);
            list.remove(top);
            return top_v ;  
        }

        //peek
        public int peek(){
            return list.get(list.size() -1) ;
        }
    }
}
package search;

public class linear {
    public static int linearSearch(String[] names, String key){
        for (int i =0 ; i<names.length;i++){
            if(names[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String[] names = {"abhang","shubham","aryan"};
        String key = "abhang";
        int index = linearSearch(names,key);
        if(index == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key is at"+ index);
        }
        
    }
}

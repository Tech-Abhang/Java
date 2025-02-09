package LinkedList;

class insersion{
    Node head;
    
    class Node{
        String data ; 
        Node next;

        //constructor
        Node(String data){
            this.data = data;
            this.next = null ; //new nodes data will always be null
        }
    }

    //add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null){
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
    }

    //add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head ; //for traversing
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print list
    public void printList() {
        if(head == null){
            System.out.print("list is null");
        }

        Node currNode = head ;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.print("NULL");
    }

    public static void main(String[] args) {
        insersion list = new insersion();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
    }
}
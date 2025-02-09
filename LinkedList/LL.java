package LinkedList;

class LL{
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

    public void startDelete(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        head = head.next ; 
    }

    public void lastDelete(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secondLastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
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

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("hi");
        list.addFirst("my");
        list.printList();
        list.lastDelete();
        list.printList();
    }
}
package BinaryTree;

public class bt {
    public static class Node{
        int data ; 
        Node left ; 
        Node right ; 

        Node(int data){
            this.data = data ; 
            this.left = null ;
            this.right = null ;
        }
    }

    static class BinaryTree{
        static int idx = -1 ; 
        public Node buildTree(int[] nodes){
                    idx ++ ; 
                    if(nodes[idx] == -1){
                        return null ;
                    }
                    //root
                    Node newNode = new Node(nodes[idx]);
                    //left
                    newNode.left = buildTree(nodes);
                    //right
                    newNode.right = buildTree(nodes);
        
                    return newNode ;
                }
            }
        
            public static void main(String[] args) {
                int nodes[] = {1,2,3,-1,-1,5,-1,3,-1,6};
                BinaryTree bt = new BinaryTree();
                Node root = bt.buildTree(nodes);
                System.out.println(root.data);

    }
}

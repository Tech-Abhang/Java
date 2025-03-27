package BinaryTree;

public class bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root , int val){
        if(root.data > val){
            root.left = delete(root.left,val) ; 
        }else if(root.data < val){
            root.right = delete(root.right,val);
        }else{
            //case 1 - no child
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 - one child
            if(root.left == null){
                return root.right ; 
            }else if(root.right == null){
                return root.left;
            }
            //case 3 - two children
            Node Ls = findInorderSuccesor(root.right);
            root.data = Ls.data;
            root.right = delete(root.right , Ls.data);
        }
        return root ; 
    }

    public static Node findInorderSuccesor(Node root){
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public static void inorder(Node root){
        if(root == null){
            return ; 
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null ; 
        for(int i = 0 ; i<values.length ; i++){
            root = insert(root , values[i]);
        }
        inorder(root);
        System.out.println();
    }
}

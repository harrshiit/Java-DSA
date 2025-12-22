public class TreeTraversal {
    public static void preorder( Node root){
        // in preorder first print root then left then right 
        if(root==null ) return ; 
        System.out.print(root.value+" "); 
        preorder(root.left);
        preorder(root.right);
    }

    public static void Inorder( Node root){
        // in Inorder first print left root then right 
        if(root==null ) return ; 
        Inorder(root.left);
        System.out.print(root.value+" "); 
        Inorder(root.right);
    }

    



    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        Node e =new Node(5);
        Node f =new Node(6);
        Node g =new Node(7);
        a.left=b;
        a.right = c ;
        b.left=d;
        b.right=e;
        c.left = f;
        c.right=g; }
    
}

 class  Node {
    int value ; 
    Node left ; 
    Node right ;

    Node( int value){
        this.value = value;
    }
}




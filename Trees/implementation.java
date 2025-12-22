import java.util.*;

public class implementation {

    public static class  Node {
        int value ; 
        Node left ; 
        Node right ;

        public Node( int value ){
            this.value = value;
        }
      }

      public static void display(  Node rootnode ){
        // in order to display as like tree where clearly we can distinguish the root node leftnode and right node 
        // this is preorder traversal Root-->Left--> right 
        if(rootnode==null) return ;
        System.out.print(rootnode.value+" --> ");
        if(rootnode.left!=null) System.out.print(rootnode.left.value+" , ");
        else System.out.print(" null ,");
        if(rootnode.right!=null) System.out.print(rootnode.right.value);
        else System.out.print("  null");
        System.out.println();
        display(rootnode.left);
        display(rootnode.right);
        
      }

      public static void actualpreorderdisplay( Node rootnode ){
        
        if(rootnode==null) return  ;
        System.out.print(rootnode.value+" ");
        actualpreorderdisplay(rootnode.left);
        actualpreorderdisplay(rootnode.right);
      }

      // to find size of a binary tree can be done using two 
      // first way like we do to display tree nodes 
     static int count=0; // we difine it globally but we have to make it static to access under static method 
      public static int size( Node rootnode){
        if(rootnode==null) return 0;
        count++;
        size(rootnode.left);
        size(rootnode.right);
        return  count;
      }

  // this is another method to find the size of tree 
      public static int size1( Node rootNode){
        if(rootNode==null) return 0;
        return 1+size1(rootNode.left)+size1(rootNode.right);
        // left subtree size , right subtree size + root node  
      }

      // find the sum of all nodes 
      public static int sum(Node rootNode){
        if(rootNode==null) return 0 ;
        return rootNode.value + sum(rootNode.left) +sum (rootNode.right);
      }

      // To print the  maximum value of node of the tree 
      public static int max(Node root ){
        if(root==null) return Integer.MIN_VALUE; // here we return min value because if we return zero and supoose node contains negative values 
        //then it will print max value as zero 
        return Math.max(root.value , Math.max(max(root.left), max(root.right)));
        }

        // finding the min value of the  node of the tree 
        public static int min(Node root){
          if(root==null) return Integer.MAX_VALUE;// suppose if all nodes are negative if we return zero it will retuen zero ans in that case 
          return Math.min(root.value, Math.min(min(root.left),min(root.right)));
        }

        // finding the height of the binary tree 
        public static int Height( Node root){
          if(root==null) return 0 ; 
          if(root.left==null&&root.right==null) return 0 ; // this is the condition of leaf node 
          // suppose if we write condition  // if(root==null) return 0 , only  as base caseit will give wrong answer
          // all becuse of if leaf node become root i will give ans 1 no matter comtain any height below it or not becuse we writing 1+ in return statement 
            return 1+Math.max(Height(root.left),Height(root.right));
          // 1 becuuse from root to left subtree the height is one 
          // using max becuse the one which subtree is deep having greater value of height 
        }


      public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(11);
        root.left =a ;
        root.right = b;
        a.left = c ;
        a.right= d;
        b.right = e;
        display(root);
        System.out.println();
        System.out.println("the actual preorder arrangement display are ");
        actualpreorderdisplay(root);
        System.out.println();
        System.out.println("The size of the tree is "+size(root));
        System.out.println();
        System.out.println("The size of the tree by another method  is "+size1(root));
        System.out.println();
        System.out.println(" the sum of the all nodes of the tree is "+sum(root));

      }
    
}

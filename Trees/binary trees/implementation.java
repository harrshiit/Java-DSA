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

      public static void actualPREORDERdisplay( Node rootnode ){
        // this follows  left  root Right 
         if(rootnode==null) return  ;
        System.out.print(rootnode.value+" ");// left
        actualPREORDERdisplay(rootnode.left);// root 
        actualPREORDERdisplay(rootnode.right);// right
      }

     // Inorder Traversal 
      public static void INORDERdisplay(Node rootNode){
        // left root right 
        if(rootNode==null) return ;
        INORDERdisplay(rootNode.left);// left 
        System.out.println(rootNode.value);// root 
        INORDERdisplay(rootNode.right);//right 

      }


      // PostOrder Traversal 
      public static void PREORDER(Node root){


        // left right and root 
        if(root==null) return ;
        PREORDER(root.left);// left
        PREORDER(root.left); // right 
        System.out.println(root.value); // root
         }

         /* the time complexicity for any type of  traversal like preorder postorder  and inorder is 
         O(n)    n-  is no of nodes 
         O(2^n) if n is no of levels all because in binary  tree 2^l = n  where l is level and n is no of nodes  */


         // Printing all nodes elements of nth level 

         public static void PrintNthLevel( Node root , int level){
          // here logic is we assume  the top  level be  the level we have  to require 
          // then we start decreasing the level whole moving down to the subtrees when  that level  becomes  1  
          // that is therequred level  we print thatlevel  nodes values
          if(root==null) return ; // suppose a particular  value of node not exist  at level either left right then  it return to the function
          if(level==1) System.out.println(root.value+" ");
          PrintNthLevel(root.left, level-1);
          PrintNthLevel(root.right, level-1); // this recursively find for nth level 
print nth
         }



      // to find size of a binary tree can be done using two 
      // first way like we do to display tree nodes 
     static int count=0; // we difine it globally but we have to make it static to access under static method 
      public static int size( Node rootnode){
        if(rootnode==null) return 0;
        count++;// instead of printing node we increase the count 
        size(rootnode.left);
        size(rootnode.right);
        return  count;
      }

  // this is another method to find the size of tree 
      public static int size1( Node rootNode){
        if(rootNode==null) return 0;
        return 1+size1(rootNode.left)+size1(rootNode.right);
        // 1(for rootnode ) + size  of left subtree + size of right subtree ;
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

// totalcost
        // To find the  product of  the nodes of the tree 
        public static  int product(Node root){
          if(root==null) return 1 ; // return 1 becuse we have to find the product 
          return  root.value*product(root.left)*product(root.right);
        }

        public static Node createTree(){
          Node root =  new Node(2);
          Node a  = new Node(3);
          Node b  = new Node(4);
          Node c  = new Node(5);
          Node d  = new Node(6);
          Node e  = new Node(7);
         root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.right = e;
          return root ;
        }
// total sima  bond is real tail worth  prpdu 
      public static void main(String[] args) {
        Node  root = createTree();
        display(root);
        System.out.println();
        System.out.println("the actual preorder arrangement display are ");
        actualPREORDERdisplay(root);
        System.out.println();
        System.out.println("The size of the tree is "+size(root));
        System.out.println();
        System.out.println("The size of the tree by another method  is "+size1(root));
        System.out.println();
        System.out.println(" the sum of the all nodes of the tree is "+sum(root));

      }
    
}

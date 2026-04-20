class TreeNode{
    int val  ;
    TreeNode left ; 
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        left = null ;
        right= null;
    }
}

public class CheckBalanceBinarytree {
    // property of balanced binary tree is height of leftside tree and rightsubtree diffrence should be max 1 
    /* APPROACH 1 
       here we recursively calulate the height of leftsubtree   and height of  right subtree and  chcck is it lessthan or equal to 1 
       and check this for recursively left and  right subtree 
        */

       /* time compleicity  id O(n^2) all beecuse height is calling again and again for same node
       a n n-1 n-2.......1 =n^2 */

    //   SPACE COMPLEXITY: O(h)
    //  *
    //  * WHY?
    //  * Recursion stack stores function calls
    //  * h = height of tree
    //  *
    //  * Worst case (skewed tree): O(n)
    //  * Best case (balanced): O(log n)
    

       public static boolean isbalanced( TreeNode root ){
        if(root == null) return true; // empty tree is balanced 

        
        int leftheight = Height(root.left);
        int rightheight=Height( root.right);
        if(Math.abs(leftheight-rightheight)>1) return false ;
        return isbalanced(root.left)&&isbalanced(root.right);
       }
       public static int Height( TreeNode root ){
        if(root==null) return 0 ;
        return 1+ Math.max(Height(root.left),Height(root.right));
       }


    //     * IDEA: APPROCH  2 
    //  * Combine height + balance check in ONE recursion
    //  *
    //  * RULE:
    //  * return height → if balanced
    //  * return -1 → if NOT balanced
    //  *
    //  * This avoids repeated calculations
    //  */

       public static int check( TreeNode root){
        if(root==null) return 0 ; // base case where the recursion stop and start returning 
        int left=check(root.left); // recursively check left part
        if(left==-1) return -1 ;//  If left subtree already unbalanced → stop early
        int right = check(root.right); 
        if(right==-1) return -1 ; 

        // now  check is current node balance or not 
        if(Math.abs(left-right)>1) return -1 ; 
 // now if none of function return -1 means all set then return height for particular node 
         return 1+Math.max(left, right);
  }

  public static boolean  isbalanced2( boolean root ){
    return check(root)!=-1; // means it will return true if  check fxn value is not -1 
  }
    /*
     * ⏱ TIME COMPLEXITY: O(n)
     *
     * WHY?
     * Each node is visited ONLY ONCE
     * No repeated height calculation
     */

    /*
     * 🧠 SPACE COMPLEXITY: O(h)
     *
     * WHY?
     * Recursion stack depth = height of tree
     */

    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);  
         // Test Brute Force
        System.out.println("Brute Force Result: " + isbalanced(root));

        // Test Optimal
        System.out.println("Optimal Result: " + isbalanced2(root));

        
    }

    
}


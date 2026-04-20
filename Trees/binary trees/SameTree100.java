import java.util.LinkedList;
import java.util.Queue;

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


public class SameTree100 {
    // Leetcode 100 
    //APPROCH 1 BY using BFS like using iterative approch 
    // here we traversing both tree levelby level and compare the nodes of both tree after storing it in queue 
    public static boolean isSameTreeBFS(TreeNode p , TreeNode  q ){
        // time -- O(n) spce -O(n )
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){ // whenever isempty become true ,  logic become false then it will not run
          TreeNode t1 = queue.poll();
          TreeNode t2= queue.poll();
          if(t1==null&& t2==null) continue ; // skips that iteration may be nodes values are find after that  iteration 
          if(t1==null || t2==null) return false ; // any one of node null maens both  tree are not same 
           if(t1.val!=t2.val) return false  ; // both same level and same side node  are not equal then return false 
          // now we are adding children of  both nodes first left and then right  in queue
          queue.add(t1.left);
          queue.add(t2.left);
          queue.add(t1.right);
           queue.add(t2.right);
          // now repeating this task until queue becomes empty after adding  all nodes like  if all nodes becomes null 
          // then queue becomes empty 
        }
        return true;
    }

    // APPROACH  2 : BY using DFS using recursive approch first it goes deep  first then backtrack by using recursion

    public static  boolean isSameTreeDFS( TreeNode p , TreeNode q){
        if(p==null&&q==null) return true ;// base case
        if(p==null|| q==null) return false ;
        if(p.val!=q.val) return false ;

        return isSameTreeDFS(p.left, q.left)&&isSameTreeDFS(p.right, q.right);


    }

    public static void main(String[] args) {
            /*
        Tree 1:
              1
             / \
            2   3
        */

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        /*
        Tree 2:
              1
             / \
            2   3
        */

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // 🔍 Test DFS
        boolean dfsResult = isSameTreeDFS(p, q);
        System.out.println("DFS Result: " + dfsResult);

        // 🔍 Test BFS
        boolean bfsResult = isSameTreeBFS(p, q);
        System.out.println("BFS Result: " + bfsResult);

        /*
        Expected Output:
        DFS Result: true
        BFS Result: true
        */
    }
    
}

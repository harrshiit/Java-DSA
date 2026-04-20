import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void LOTraversal(implementation.Node root){
        /*// Recursive Level Order Traversal
// Time Complexity : O(n^2) in worst case
// Space Complexity : O(h)
// Inefficient because the tree is traversed repeatedly
// for each level. */

        int h = implementation.Height(root);

        for(int i = 1; i <= h + 1; i++){
            implementation.PrintNthLevel(root, i);
        }
    }

    public static void bfs( implementation.Node root){
        // iterative way of level  order traversal with help of queue
        Queue<implementation.Node> q =new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){

        }

    }

    public static void main(String[] args){

        implementation.Node root = implementation.createTree();

        System.out.println("Level Order Traversal:");

        LOTraversal(root);
    }
}
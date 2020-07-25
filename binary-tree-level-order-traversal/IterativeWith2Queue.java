import java.util.*;

public class IterativeWith2Queue{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[3,9,20,null,null,15,7]");
    List<List<Integer>> list = levelOrder(root);
    TreeUtils.printNode(root);

    System.out.println(list);
  }


  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ll = new ArrayList<>(); // List of levels LevelList
    if(root == null) return ll;

    Deque<TreeNode> q1 = new ArrayDeque<>(); // Queue for One level
    Deque<TreeNode> q2 = new ArrayDeque<>(); // Queue for Second Level
    List<Integer> l = null;  // List to hold the values at a level

    TreeNode n = root;  // The TreeNode on which we'll be working on

    q1.offer(n);  //Since the root is not null, start with it

    while(!q1.isEmpty() || !q2.isEmpty()){ // While One of both have some value, keep iterating


      // Iterate the Q1

      // IF the q2 is not empty, we need a new list to add values
      if(!q1.isEmpty()) l= new ArrayList<>();

      while(!q1.isEmpty()){
        n = q1.poll();
        l.add(n.val);
        if(n.left != null) q2.offer(n.left);
        if(n.right != null ) q2.offer(n.right);

        // IF the Q is empty, add the list to the result
        if(q1.isEmpty()) ll.add(new ArrayList(l));
      }


      // Iterate the Q2

      // IF the q2 is not empty, we need a new list to add values
      if(!q2.isEmpty()) l= new ArrayList<>();


      while(!q2.isEmpty()){
        n = q2.poll();
        l.add(n.val);
        if(n.left != null) q1.offer(n.left);
        if(n.right != null ) q1.offer(n.right);

        // IF the Q is empty, add the list to the result
        if(q2.isEmpty()) ll.add(new ArrayList(l));
      }
    }
    return ll;
  }
}

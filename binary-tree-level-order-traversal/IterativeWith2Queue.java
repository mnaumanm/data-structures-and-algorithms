import java.util.*;

public class IterativeWith2Queue{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[3,9,20,null,null,15,7]");
    List<List<Integer>> list = levelOrder(root);
    TreeUtils.printNode(root);

    System.out.println(list);
  }


  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ll = new ArrayList<>();
    if(root == null) return ll;

    Deque<TreeNode> q1 = new ArrayDeque<>();
    Deque<TreeNode> q2 = new ArrayDeque<>();
    List<Integer> l = null;

    TreeNode n = root;

    q1.offer(n);

    while(!q1.isEmpty() || !q2.isEmpty()){

      if(!q1.isEmpty()) {
        l= new ArrayList<>();
      }
      while(!q1.isEmpty()){
        n = q1.poll();
        l.add(n.val);
        if(n.left != null) q2.offer(n.left);
        if(n.right != null ) q2.offer(n.right);

        if(q1.isEmpty()) {
          ll.add(new ArrayList(l));
        }

      }

      if(!q2.isEmpty()) {
        l= new ArrayList<>();
      }

      while(!q2.isEmpty()){
        n = q2.poll();
        l.add(n.val);
        if(n.left != null) q1.offer(n.left);
        if(n.right != null ) q1.offer(n.right);

        if(q2.isEmpty()) {
          ll.add(new ArrayList(l));
        }
      }
    }

    return ll;
  }


}

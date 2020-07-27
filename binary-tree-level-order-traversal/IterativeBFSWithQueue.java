import java.util.*;

public class IterativeBFSWithQueue{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[3,9,20,null,null,15,7]");
    List<List<Integer>> map = levelOrder(root);
    TreeUtils.printNode(root);

    System.out.println(map);
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList();

    Deque<TreeNode> q = new ArrayDeque<>();

    q.offer(root);
    int l=0; // Level

    while(!q.isEmpty()){
      TreeNode n = q.poll();
      List llist = null;
      if(llist.size() <=l){
        llist = new ArrayList<>();
      }
      llist = list.get(l);
      if(n.left != null) q.offer(n);
      if(n.right != null) q.offer(n);

    }


    return list;
  }
}

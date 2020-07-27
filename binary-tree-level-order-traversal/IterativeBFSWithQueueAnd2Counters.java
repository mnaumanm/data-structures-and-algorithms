import java.util.*;

public class IterativeBFSWithQueueAnd2Counters{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[1,2,3,4,5,6,7,null,null,8,9,null,null,10,null]");
    List<List<Integer>> list = levelOrder(root);
    TreeUtils.printNode(root);

    System.out.println(list);
  }


  public static List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> ll = new ArrayList<>();

    if(root == null) return ll;

    List<Integer> l = new ArrayList<>();
    Deque<TreeNode> q = new ArrayDeque<>();
    int clc = 0 ; // level, currently in process
    int nlc = 0; // Next Level Counter, while processing current this will keep track of nodes to process for next level

    TreeNode n = root; // Since we know the current node is root

    q.offer(n);
    clc++;

    while(!q.isEmpty()){ // While q has any node to process
      while(clc>0){  // This means there is still a node remain to be processed fro this level
        n = q.poll();
        l.add(n.val);
        if(n.left != null){
          q.offer(n.left);
          nlc++;
        }

        if(n.right != null){
          q.offer(n.right);
          nlc++;
        }
        clc--;
      }
      clc=nlc;
      nlc=0;
      ll.add(new ArrayList(l));
      l = new ArrayList<>();

    }
    return ll;
  }


}

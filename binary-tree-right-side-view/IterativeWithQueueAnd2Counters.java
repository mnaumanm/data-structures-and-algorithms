import java.util.*;

public class IterativeWithQueueAnd2Counters{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[3,9,20,17,null,null,null,57,67]");
    List<Integer> list = rightSideView(root);
    TreeUtils.printNode(root);

    System.out.println(list);
  }

  public static List<Integer> rightSideView(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      if (root == null) return list;

      Deque<TreeNode> q = new ArrayDeque<>();

      int clc =0; // Current level Count
      int nlc =0; // Next level count

      int cl =0; // Currrent level
      TreeNode n = root;// Current Node WIP

      q.offer(n);
      clc++;

      while(!q.isEmpty()){
          while(clc>0){
              n =  q.poll();

              if(cl >= list.size()){
                    //index not exists
                  list.add(cl,n.val);
              }else{
                  // index exists
                  list.set(cl,n.val);
              }

              if(n.left !=null){
                  q.offer(n.left);
                  nlc++;
              }

              if(n.right !=null){
                  q.offer(n.right);
                  nlc++;
              }
              clc--;
          }
          cl++;
          clc = nlc;
          nlc = 0;
      }

      return list;
  }
}

import java.util.*;

public class RecursionWithMap{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[3,9,20,null,null,15,7]");
    List<List<Integer>> list = levelOrder(root);
    TreeUtils.printNode(root);

    System.out.println(list);
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    return levelOrder(root,0,new ArrayList<>());
  }

  public static List<List<Integer>> levelOrder(TreeNode n,int l,List<List<Integer>> list) {
    if(n==null) return list;

    if(list.size() <= l){
        list.add(l,new ArrayList<Integer>());
    }

    list.get(l).add(n.val);

    list = levelOrder(n.left,l+1,list);
    list = levelOrder(n.right,l+1,list);

    return list;

  }
}

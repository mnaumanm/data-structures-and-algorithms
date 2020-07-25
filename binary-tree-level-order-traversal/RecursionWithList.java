import java.util.*;

public class RecursionWithList{
  public static void main(String[] args){
    TreeNode root = TreeUtils.stringToTreeNode("[3,9,20,null,null,15,7]");
    List<List<Integer>> map = levelOrder(root);
    TreeUtils.printNode(root);

    System.out.println(map);
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    return new ArrayList(  levelOrder(root,0,new HashMap<>()).values()  ) ;
  }

  public static Map<Integer,List<Integer>> levelOrder(TreeNode n,int l,Map<Integer,List<Integer>> map) {
    if(n==null) return map;

    List<Integer> list = map.get(l);
    if(list ==null) list = new ArrayList<>();

    list.add(n.val);
    map.put(l,list);

    map = levelOrder(n.left,l+1,map);
    map = levelOrder(n.right,l+1,map);

    return map;
  }
}

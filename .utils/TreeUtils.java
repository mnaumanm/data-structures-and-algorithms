import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TreeUtils{

  public static TreeNode tree(int[] a) {
    return arrayToTreeNode(a);
  }

  public static TreeNode tree(String input) {
    return stringToTreeNode(input);
  }


  /*
  int[] a = new int[] { 10, 5, 15, -1, -1, 6, 20 };
  TreeNode n = TreeUtils.arrayToTreeNode(a);
  */
  public static TreeNode arrayToTreeNode(int[] a) {
    TreeNode[] trees = new TreeNode[a.length];
    for (int i = 0; i < (a.length) / 2; i++) {
      if (trees[i] == null) trees[i] = new TreeNode(a[i]);

      trees[2 * i + 1] = (a[2 * i + 1] == -1 ) ? null : new TreeNode(a[2 * i + 1]);
      trees[i].left = trees[2 * i + 1];

      trees[2 * i + 2] = (a[2 * i + 2] == -1 ) ? null : new TreeNode(a[2 * i + 2]);
      trees[i].right = trees[2 * i + 2];
    }
    return trees[0];
  }

  /**
    TreeNode root = TreeUtils.stringToTreeNode("[1,2,2,3,null,null,3,4,null,null,4]");
    TreeNode root = TreeUtils.stringToTreeNode("[10,5,15,3,6,13,20]");
  */
  public static TreeNode stringToTreeNode(String input) {
    input = input.substring(1, input.length() - 1);
    if (input.length() == 0) {
      return null;
    }

    String[] parts = input.split(",");
    String item = parts[0];
    TreeNode root = new TreeNode(Integer.parseInt(item));
    Queue<TreeNode> nodeQueue = new LinkedList<>();
    nodeQueue.add(root);

    int index = 1;
    while(!nodeQueue.isEmpty()) {
      TreeNode node = nodeQueue.remove();

      if (index == parts.length) {
        break;
      }

      item = parts[index++];
      item = item.trim();
      if (!item.equals("null")) {
        int leftNumber = Integer.parseInt(item);
        node.left = new TreeNode(leftNumber);
        nodeQueue.add(node.left);
      }

      if (index == parts.length) {
        break;
      }

      item = parts[index++];
      item = item.trim();
      if (!item.equals("null")) {
        int rightNumber = Integer.parseInt(item);
        node.right = new TreeNode(rightNumber);
        nodeQueue.add(node.right);
      }
    }
    return root;
  }

  public static List<String> binaryTreePaths(TreeNode node){
    Set set = new LinkedHashSet();
    List<String> result = new ArrayList();
    return binaryTreePaths(node,set,result);
  }

  public static List<String> binaryTreePaths(TreeNode node, Set set, List<String> result){
    if(node == null) return result;

    //SELECT
    set.add(node);

    //PROCESS
    if(node.left == null && node.right == null){
      String s = "";
      for(Object n : set){
        s=  s+ (s.isEmpty()?"":"->") + ((TreeNode)n).val;
      }

      result.add(s);
    }
    binaryTreePaths(node.left,set,result);
    binaryTreePaths(node.right,set,result);

    //UNSELECT
    set.remove(node);

    return result;
  }


  public static void printInOrder(TreeNode n){
    if(n== null) return;
    printInOrder(n.left);
    System.out.print(n.val+",");
    printInOrder(n.right);
  }



  public static void printInOrderUsingStack(TreeNode root)
  {
    Stack<TreeNode> st = new Stack<TreeNode>();
    while (root != null || !st.empty())
    {
      while (root != null)
      {
        st.push(root);
        root = root.left;
      }
      root = st.pop();
      System.out.println(root.val);
      root = root.right;
    }
  }


  /*
    TreeUtils.printNode(root);
  */
  public static void print(TreeNode root) {
    int maxLevel = TreeUtils.maxLevel(root);
    printNodeInternal(Collections.singletonList(root), 1, maxLevel);
  }

  public static void printNode(TreeNode root) {
    int maxLevel = TreeUtils.maxLevel(root);
    printNodeInternal(Collections.singletonList(root), 1, maxLevel);
  }

  private static void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
    if (nodes.isEmpty() || TreeUtils.isAllElementsNull(nodes)){
      return;
    }

    int floor = maxLevel - level;
    int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
    int firstSpaces = (int) Math.pow(2, (floor)) - 1;
    int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

    TreeUtils.printWhitespaces(firstSpaces);

    List<TreeNode> newNodes = new ArrayList<TreeNode>();
    for (TreeNode node : nodes) {
      if (node != null) {
        System.out.print(node.val);
        newNodes.add(node.left);
        newNodes.add(node.right);
      } else {
        newNodes.add(null);
        newNodes.add(null);
        System.out.print(" ");
      }

      TreeUtils.printWhitespaces(betweenSpaces);
    }
    System.out.println("");

    for (int i = 1; i <= endgeLines; i++) {
      for (int j = 0; j < nodes.size(); j++) {
        TreeUtils.printWhitespaces(firstSpaces - i);
        if (nodes.get(j) == null) {
          TreeUtils.printWhitespaces(endgeLines + endgeLines + i + 1);
          continue;
        }

        if (nodes.get(j).left != null){
          System.out.print("/");
        }else{
          TreeUtils.printWhitespaces(1);
        }

        TreeUtils.printWhitespaces(i + i - 1);

        if (nodes.get(j).right != null){
          System.out.print("\\");
        }else{
          TreeUtils.printWhitespaces(1);
        }
        TreeUtils.printWhitespaces(endgeLines + endgeLines - i);
      }
      System.out.println("");
    }

    printNodeInternal(newNodes, level + 1, maxLevel);
  }

  private static void printWhitespaces(int count) {
    for (int i = 0; i < count; i++)
    System.out.print(" ");
  }

  private static int maxLevel(TreeNode node) {
    if (node == null)
    return 0;

    return Math.max(TreeUtils.maxLevel(node.left), TreeUtils.maxLevel(node.right)) + 1;
  }

  private static boolean isAllElementsNull(List<TreeNode> list) {
    for (Object object : list) {
      if (object != null)
      return false;
    }
    return true;
  }
}

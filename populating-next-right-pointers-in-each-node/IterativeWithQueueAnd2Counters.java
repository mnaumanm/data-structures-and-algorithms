import java.util.*;

public class IterativeWithQueueAnd2Counters{
 	public static void main(String[] args){

    Node r3 = new Node(3);
    Node r2 = new Node(2);
    Node r1 = new Node(1,r2,r3,null);
    connect(r1);


    System.out.println(r1);
	}

  public static Node connect(Node root) {
      if(root==null) return null;

      Deque<Node> q = new ArrayDeque<>();

      int clc =0; // Current Level Count;
      int nlc =0; // Next level count;

      Node n = root; // Node that is currnt and WIP

      q.offer(n);  // put the working node in a queue to process
      clc++;       // since we are working on a root level. increment it.

      Node p = null; // Keep track of Previous node that will point to next (n)
      while(!q.isEmpty()){
          while(clc>0){
              n = q.poll();

              if(p!=null) {
                  p.next = n;
              }

              if(n.left != null){
                  q.offer(n.left);
                  nlc++;
              }

              if(n.right != null){
                  q.offer(n.right);
                  nlc++;
              }
              p=n;
              clc--;
          }
          p=null;
          clc = nlc;
          nlc = 0;
      }
      return root;
  }
}

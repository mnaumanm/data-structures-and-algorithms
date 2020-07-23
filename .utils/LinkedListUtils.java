import java.util.*;

public class LinkedListUtils{

  /*
  SinglyLinkedListNode head = LinkedListUtils.stringToSinglyLinkedList(list);
  */

  public static SinglyLinkedListNode stringToSinglyLinkedList(String s){
    if(null ==s || s.isEmpty() ) return null;
    String[] a = s.split(",");

    SinglyLinkedListNode p = new SinglyLinkedListNode(0);
    SinglyLinkedListNode d = p;
    SinglyLinkedListNode c = null;

    for(int i=0;i<a.length;i++){
      c = new SinglyLinkedListNode(Integer.valueOf(a[i]) );
      p.next = c;
      p=c;
    }

    return d.next;
  }

  public static SinglyLinkedListNode stringToSinglyLinkedListWithCycleAtIndex(String s,int k){
    SinglyLinkedListNode head = LinkedListUtils.stringToSinglyLinkedList(s);
    head = LinkedListUtils.startCycleAtIndex(head,k);
    return head;
  }

  public static DoublyLinkedListNode stringToDoublyLinkedList(String s){
    if(null ==s || s.isEmpty() ) return null;
    String[] a = s.split(",");

    DoublyLinkedListNode p = new DoublyLinkedListNode(0);
    DoublyLinkedListNode d = p;
    DoublyLinkedListNode c = null;

    for(int i=0;i<a.length;i++){
      c = new DoublyLinkedListNode(Integer.valueOf(a[i]) );
      c.prev = p;
      p.next = c;
      p=c;
    }
    d.next.prev=null;
    return d.next;
  }

  /**
  LinkedListUtils.preetyPrint(head);
  */
  public static String preetyPrint(DoublyLinkedListNode h){
    StringBuffer sb = new StringBuffer();

    if(h==null){System.out.println("NULL");return "";}
    while(h!=null){
      sb.append(":::PREV="+((h.prev==null)?null:h.prev.data)+":::VAL="+h.data+":::NEXT="+((h.next==null)?null:h.next.data)   );
      h=h.next;
    }
    return sb.toString();
  }

  /**
  LinkedListUtils.preetyPrint(head);
  */
  public static String preetyPrint(SinglyLinkedListNode h){
    StringBuffer sb = new StringBuffer();

    while(h!=null){
      sb.append("_"+h.data+"-->" );
      h=h.next;
    }
    sb.append("NULL");
    return sb.toString();
  }



  /**
  SinglyLinkedListNode head = LinkedListUtils.stringToSinglyLinkedList(list);
  head = LinkedListUtils.startCycleAtIndex(head,3);
  */
  public static SinglyLinkedListNode startCycleAtIndex(SinglyLinkedListNode h,int k){

    SinglyLinkedListNode c = h;
    SinglyLinkedListNode p = h;

    while(c!=null){
      p=c;
      c=c.next;
    }

    SinglyLinkedListNode t = p; // Tail Node

    c=h;
    int i=0;

    if(k==0){
      t.next=h;
    } else{
      while(i<k){
        c=c.next;
        i++;
      }
      t.next=c;
    }
    return h;
  }

  /**
  SinglyLinkedListNode head = LinkedListUtils.stringToSinglyLinkedList(list);
  head = LinkedListUtils.startCycleAtIndex(head,3);
  */
  public static SinglyLinkedListNode getNodeAtIndex(SinglyLinkedListNode h,int k){

    SinglyLinkedListNode c = h;
    SinglyLinkedListNode p = h;


    c=h;
    int i=0;

    if(k==0){
      return h;
    } else{
      while(i<k){
        c=c.next;
        i++;
      }
      return c;
    }
  }
}

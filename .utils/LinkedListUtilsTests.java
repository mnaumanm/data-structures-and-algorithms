import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
➜  my-stuff git:(master) ✗ export PROBLEM=".utils"
➜  my-stuff git:(master) ✗ javac -classpath "./$CODE_BASE/.bin:./$CODE_BASE/.lib/*:./$CODE_BASE/.utils" -d ./$CODE_BASE/.bin ./$CODE_BASE/$PROBLEM/*.java
➜  my-stuff git:(master) ✗ java -Xmx8m -classpath "./$CODE_BASE/.bin:./$CODE_BASE/.lib/*" org.junit.runner.JUnitCore LinkedListUtilsTests
*/

public class LinkedListUtilsTests{

  @Test
  public void t_getNode() {

    String list="1,2,3,4,5,6";
    SinglyLinkedListNode head = LinkedListUtils.stringToSinglyLinkedList(list);

    assertEquals(head.next.next.next,LinkedListUtils.getNodeAtIndex(head,3));
    assertEquals(head.next,LinkedListUtils.getNodeAtIndex(head,1));
    assertEquals(head,LinkedListUtils.getNodeAtIndex(head,0));

    assertEquals(head.next.next.next.next.next,LinkedListUtils.getNodeAtIndex(head,5));



  }

}

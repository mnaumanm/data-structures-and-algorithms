class DoublyLinkedListNode {
  int data;
  DoublyLinkedListNode next;
  DoublyLinkedListNode prev;

  DoublyLinkedListNode(){}

    DoublyLinkedListNode(int data){
      this.data = data;
    }

    DoublyLinkedListNode(int data,DoublyLinkedListNode prev, DoublyLinkedListNode next){
      this.data = data;
      this.next = next;
    }

  }

import javax.swing.event.ListDataEvent;

public class SinglyLinkedList {
//  DSA used for storing a collection of nodes
//  contains a listnode class
  //when a new node is created its next by default points to null
  private ListNode head; //instance of type listnode
  private static class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data){
      this.data=data;
      this.next=null;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList sll=new SinglyLinkedList();
//    creating nodes (data part)
    sll.head= new ListNode(10);
    ListNode second=new ListNode(12);
    ListNode third=new ListNode(43);
    ListNode fourth=new ListNode(22);

//    sorted singlylist
    SinglyLinkedList sortedList=new SinglyLinkedList();
//    1=>2=>3=>4=>5
    sortedList.head=new ListNode(1);
    ListNode val2=new ListNode(1);
    ListNode val3=new ListNode(3);
    ListNode val4=new ListNode(3);
    ListNode val5=new ListNode(5);

    sortedList.head.next=val2;
    val2.next=val3;
    val3.next=val4;
    val4.next=val5;

//    removing duplicate entries
    sortedList.removeDuplicates();
    System.out.print("Removing duplicates : ");sortedList.display();



    //    creating nodes (next addr part)
    sll.head.next=second; //10 -> 12
    second.next=third;// 10 -> 12 -> 43
    third.next=fourth; // 10 -> 12 -> 43 -> 22 -> null

//    printing the elements by traversing from head to tail
    sll.display();

// counting num of elements
    System.out.println("Number of elements : "+sll.counter());

//inserting a new node at the beginning
    sll.insertFirst(90);
    sll.display();

//inserting a new node at the end
    sll.insertLast(88);
    sll.display();

    //inserting a new node at a given position
    sll.insertAtPosition(77,2);
    sll.display();

    //deleting the first node
    sll.deleteFirst();
    sll.display();

//    deleting the last node
    sll.deleteLast();
    sll.display();

//deleting from a given position
    sll.deletePosition(2);
    sll.display();

//    searching for key
//    System.out.println("search key status : "+sll.SearchKey(77));

//    Reversing a singly linked list
    sll.display(sll.ReverseList());

//   finding the middle node in the list
    System.out.println("Middle node : "+sll.middleNode().data);

//    finding the nth node of the list while counting from the end
    System.out.println("Value from end is "+sll.nth_value_counting_from_end(2).data);
  }

  public void removeDuplicates() {
    ListNode counter=head;
    while(counter !=null && counter.next!=null){
      if (counter.data == counter.next.data){
        counter.next=counter.next.next;
      }
      else{
        counter=counter.next;
      }
    }
  }

  /**
   * finding the nth node of the list while counting from the end
    */
  public ListNode nth_value_counting_from_end(int position){
    if(head==null || head.next==null)
    {
      return head;
    }
    if(position <0){
      throw new IllegalArgumentException("Invalid value "+ position);
    }
    ListNode mainNode=head;
    ListNode RefrNode=head;
    int count=0;
    while(count < position){
      if(RefrNode == null){
        throw new IllegalArgumentException( position+" is greater than the number of nodes.");
      }
      RefrNode=RefrNode.next;
      count++;
    }
    while(RefrNode !=null){
      RefrNode=RefrNode.next;
      mainNode=mainNode.next;
    }
    return mainNode;
  }

  /**
   * finding the middle node*/
  
public ListNode middleNode(){
  if(head==null || head.next==null){
    return head;
  }
  ListNode SlowMoV=head;
  ListNode FastMov=head;
  while (FastMov != null){
    SlowMoV=SlowMoV.next;
    FastMov=FastMov.next.next;
  }
  return SlowMoV;
}
  /**
   * Reversing a singly linked list
   */

  public ListNode ReverseList(){
    if(head ==null){
      return head;
    }
    ListNode current=head;
    ListNode previous=null;
    ListNode next;

    while(current !=null){
      next=current.next;
      current.next=previous;
      previous=current;
      current=next;
    }
      return previous;
  }

/**
 * inserting a node at head
 * */
public void insertFirst(int value){
  ListNode newNode=new ListNode(value);
  newNode.next=head;
  head=newNode;

}

  /**
   *  inserting a new node at the end
  */
  public void insertLast(int value){
    ListNode newNode=new ListNode(value);
//    where list is empty
    if(head == null){
      head=newNode;
    }
//    where list contains elements
    ListNode current=head;
    while (current.next != null){
      current=current.next;
    }
//    insert ar last position
    current.next=newNode;
  }

  /**
   *inserting a new node at a given position
   */
  public void insertAtPosition(int value,int position){
    // 10 -> 12 -> 43
    //10 -> 77 -> 12 -> 43
    ListNode node=new ListNode(value);
    if (position == 1){
      node.next=head;
      head=node;
    }
    else{
      ListNode previous=head;//create=ing a temp node for traversing
      int count=1;
      while (count<position-1){
        previous=previous.next;//moving till we reach before the supposed position
        count++;
      }
      ListNode current=previous.next;
      previous.next=node;
      node.next=current;

    }

  }

  public void display(){
    ListNode current=head; // define a listnode named current
    while(current != null ){
      System.out.print(current.data+" -> ");
      current=current.next;
    }
    System.out.println("null");
  }

  public void display(ListNode head){
    ListNode current=head; // define a listnode named current
    while(current != null ){
      System.out.print(current.data+" -> ");
      current=current.next;
    }
    System.out.println("null");
  }
  public int counter(){
    if(head == null){
      return 0;
    }
    ListNode current=head;
    int counter=0;
    while(current != null){
      counter++;
      current=current.next;
    }

    return counter;
  }
//deletion
  /**
   * deleting the first node
   */
  public ListNode deleteFirst(){
    if(head==null){
      return null;
    }
    ListNode temp=head;
    head=head.next;
    temp.next=null;
    return temp;
  }
  /**
   * deleting the last node
   * */
  public ListNode deleteLast() {
    if(head==null || head.next==null){
      return head;
    }
    else{
      ListNode current=head;
      ListNode previous=null;
      while(current.next != null){
        previous=current;
        current=current.next;
      }
      previous.next=null;
      return current;
    }
  }

  /**
   * deleting from given position
   * */
  public void deletePosition(int position){
    if(position == 1){
      head=head.next;
    }
    else{
      ListNode previous=head;
      int count=1;
      while(count<position-1){
        previous=previous.next;
        count++;
      }
      ListNode current=previous.next;
      previous.next=current.next;
    }

  }
  /**
   * Searching for key
   */
  public boolean SearchKey(int key){
    ListNode start=head;
    if(head ==null){
      return false;
    }
    while(start !=null){
      if(start.data==key){
        return true;
      }
      start=start.next;
    }
    return false;
  }
}

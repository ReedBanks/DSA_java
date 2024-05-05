public class SinglyLinkedList2 {

  private ListNode head;
  private static class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int value){
      this.data=value;
      this.next=next;
    }
  }

  public static void main(String[] args) {

    SinglyLinkedList2 Lister=new SinglyLinkedList2();
    Lister.head=new ListNode(0);
    ListNode val1=new ListNode(1);
    ListNode val2=new ListNode(3);
    ListNode val3=new ListNode(24);

    SinglyLinkedList2 Lister1=new SinglyLinkedList2();
    Lister1.head=new ListNode(2);
    ListNode Lval1=new ListNode(4);
    ListNode Lval2=new ListNode(5);
    ListNode Lval3=new ListNode(6);


    Lister.head.next=val1;
    val1.next=val2;
    val2.next=val3;


    Lister1.head.next=Lval1;
    Lval1.next=Lval2;
    Lval2.next=Lval3;

    System.out.print("List 1 :");Lister.display();
    System.out.print("List 2 :");Lister1.display();
    System.out.print("Merger : ");

    System.out.print("Sum of lists : ");
    SinglyLinkedList2 sums=new SinglyLinkedList2();
    sums.head=addLists(Lister.head,Lister1.head);
    sums.display();

    SinglyLinkedList2 result=new SinglyLinkedList2();
    result.head=MergeList(Lister.head,Lister1.head);
    result.display();

    Lister.insertNode(new ListNode(5));
    System.out.print("Insert a node in a sorted list :");
    Lister.display();

//    remove a key from the list
    System.out.print(" remove a key from the list :");
    Lister.removeKey(2);
    Lister.display();
//detecting a loop in the list
    System.out.println("Loop status : "+Lister.DetectLoop());
  }

//  adding two lists
  public static ListNode addLists(ListNode head,ListNode head1){
    ListNode dummy=new ListNode(0);
    ListNode tail=dummy;
    int carry=0;
    while(head !=null || head1 !=null){
      int x=(head !=null) ? head.data : 0;
      int y=(head1 !=null) ? head1.data : 0;
      int sum=carry+x+y;
      carry=sum/10;
      tail.next=new ListNode(sum %10);
      tail=tail.next;

      if(head !=null) head=head.next;
      if(head1 !=null) head1=head1.next;
      }
    if(carry > 0){
      tail.next=new ListNode(carry);
    }

    return dummy.next;
  }


  public static ListNode MergeList(ListNode head, ListNode head1) {
    ListNode dummy=new ListNode(0);
    ListNode tail=dummy;
    while (head !=null && head1 !=null){
      if (head.data < head1.data){
        tail.next=head;
        head=head.next;
      }
      else {
        tail.next = head1;
        head1 = head1.next;
      }
      tail=tail.next;
    }
    if(head.next ==null){
      tail.next=head1;
    } else {
      tail.next=head;
    }
    return dummy.next;
  }

  /**
   * merging two sorted lists
   * */


  /**
 * detecting a loop in the list
 * */
private boolean DetectLoop(){
  ListNode fastPtr=head;
  ListNode slowPtr=head;

  while(fastPtr !=null && fastPtr.next != null){
    fastPtr=fastPtr.next.next;
    slowPtr=slowPtr.next;

    if(fastPtr == slowPtr)return true;

  }
  return false;
}

/**
 * detect the start of a loop in the list
 * */
private ListNode StartOfLoop(){
  ListNode fastPtr=head;
  ListNode slowPtr=head;

  while(fastPtr !=null && fastPtr.next != null){
    fastPtr=fastPtr.next.next;
    slowPtr=slowPtr.next;

    if(fastPtr == slowPtr)
    {return getStartingNode(slowPtr);}
  }
  return null;
}

  private ListNode getStartingNode(ListNode slowPtr) {
  ListNode temp=head;
  while(slowPtr != temp){
    temp=temp.next;
    slowPtr=slowPtr.next;
  }
  return temp;//starting node
  }

/**
 * removing loops
 * */
private ListNode RemoveLoop(){
  ListNode fastPtr=head;
  ListNode slowPtr=head;

  while(fastPtr !=null && fastPtr.next != null){
    fastPtr=fastPtr.next.next;
    slowPtr=slowPtr.next;

    if(fastPtr == slowPtr)
    {return remover(slowPtr);}
  }
  return null;
}

  private ListNode remover(ListNode slowPtr) {
    ListNode temp=head;
    while(slowPtr.next != temp.next){
      temp=temp.next;
      slowPtr=slowPtr.next;
    }
    return slowPtr.next=null;//starting node
  }


  /**
 * //    remove a key from the list
 * */  private void removeKey(int node) {
   ListNode current=head;
   ListNode follow=null;
   while(current !=null && current.data !=node) {
     follow = current;
     current = current.next;
   }
     if(current == null)return;
      follow.next=current.next;

   }

  public ListNode insertNode(ListNode node) {
    ListNode current=head;
    ListNode temp=null;
    while(current !=null && current.data<node.data){
      temp=current;
      current=current.next;
    }
    node.next=current;
    temp.next=node;
    return head;
  }

  public void display(){
    SinglyLinkedList2.ListNode current=head; // define a listnode named current
    while(current != null ){
      System.out.print(current.data+" -> ");
      current=current.next;
    }
    System.out.println("null");
  }

  public void display(SinglyLinkedList2.ListNode head){
    SinglyLinkedList2.ListNode current=head; // define a listnode named current
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
    SinglyLinkedList2.ListNode current=head;
    int counter=0;
    while(current != null){
      counter++;
      current=current.next;
    }

    return counter;
  }

}

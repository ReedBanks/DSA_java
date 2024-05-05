import java.util.NoSuchElementException;

public class CircularLinkedList {
  private ListNode last;
  private int length;

  class ListNode {
    private ListNode next;
    private int data;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public CircularLinkedList() {
    length = 0;
    last = null;
  }

  public int getLength() {
    return length;
  }

  public void CreateCircularLinkeList() {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);

    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first;


    last = fourth;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void display() {
    if (last == null) {
      return;
    }
    ListNode temp = last.next;
    while (temp != last) {
      System.out.print(temp.data + " => ");
      temp = temp.next;
    }
    System.out.print(temp.data);
  }

  /**
   * insert node at beginning of a circular linked list list
   */
  public void insertFirst(int data) {
    ListNode newNode = new ListNode(data);
    if (last == null) {
      last = newNode;
    } else {
      newNode.next = last.next;
    }
    last.next = newNode;
    length++;
  }
  /**
   * insert node at the end of the list */

public void insertLast(int data){
  ListNode temp=new ListNode(data);
if(last==null){
  last=temp;
  last.next=last;
}
else{
  temp.next=last.next;
  last.next=temp;
  last=temp;
}

length++;
}
  /**
   * delete node at beginning of a circular linked list
   */
  public ListNode deleteFirst(){
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    ListNode temp=last.next;
    if(last.next == last){
      last=null;
    }
    else{
      last.next=temp.next;
    }
    temp.next=null;
    length--;
    return temp;
  }

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();
    cll.CreateCircularLinkeList();
    cll.insertFirst(23);
    cll.insertLast(99);
    cll.display();
    System.out.println("\n"+cll.deleteFirst().data);
  }
}

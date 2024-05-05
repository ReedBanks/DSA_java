import java.util.EmptyStackException;

public class Stacking {

  private ListNode top;
  private int lenght;



  private class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public boolean isEmpty() {
    return lenght == 0;
  }

  Stacking() {
    lenght = 0;
    top = null;
  }


  /**
   * implementation using the linked list format
   */
  public void push(int data) {
    ListNode newNode = new ListNode(data);
    if(top ==null){
      top=newNode;
    }
    else{
    newNode.next = top;
    top = newNode;
    }
    lenght++;
  }

  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    int result = top.data;
    top = top.next;
    return result;
  }

  public void display() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    ListNode temp = top;
    while (temp != null) {
      System.out.print(temp.data + " => ");
      temp = temp.next;
    }
    System.out.println("null");
  }


  public static void main(String[] args) {
    Stacking stk = new Stacking();
    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.pop();
    stk.display();

  }
}

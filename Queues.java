import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  private ListNode rear;
  private ListNode front;
  private int length;

  public Queues() {
    this.front = null;
    this.rear = null;
    length = 0;
  }


  private static class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }

  }

  public int lenght() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void enqueue(int value) {
    ListNode temp = new ListNode(value);
    if (isEmpty()) {
      front = temp;
    } else {
      rear.next = temp;
    }
    rear = temp;
    length++;
  }

  public void display() {
    if (isEmpty()) {
      return;
    }
    ListNode current = front;
    while (current != null) {
      System.out.print(current.data + " => ");
      current = current.next;
    }
    System.out.print("null");
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is Empty");
    }
    ListNode current = front;
    front = front.next;
    if (front == null) {
      rear = null;
    }
    length--;
    return current.data;
  }

  /**
   * generate binary numbers from 1 to n using queue
   */
  public void genBinary(int n) {
    String[] result = new String[n];
    Queue<String> q = new LinkedList<>();
    q.offer("1");
    for (int i = 0; i < n; i++) {
      result[i] = q.poll();
      String n1 = result[i] + "0";
      String n2 = result[i] + "1";
      q.offer(n1);
      q.offer(n2);
    }
    System.out.println();
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]+" => ");
    }
    System.out.print("null");
  }

  public static void main(String[] args) {

    Queues newQue = new Queues();

    newQue.enqueue(1);
    newQue.enqueue(2);
    newQue.enqueue(3);
    newQue.enqueue(4);
    newQue.enqueue(5);
    newQue.dequeue();
    newQue.display();

    newQue.genBinary(7);

  }
}

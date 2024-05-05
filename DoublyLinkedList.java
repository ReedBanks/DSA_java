import java.awt.*;
import java.util.NoSuchElementException;

public class DoublyLinkedList {

  private ListNode head;
  private ListNode tail;
  private int lenght;

  private class ListNode {
    private int data;
    private ListNode next;
    private ListNode previous;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.lenght = 0;
  }

  public boolean isEmpty() {
    return lenght == 0;
  }

  /**
   * display content of the doublylinkedlist starting from head
   */
  public void displayFromhead() {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + " => ");
      temp = temp.next;
    }
    System.out.print("null \n");
  }

  /**
   * display content of the doublylinkedlist starting from tail
   */
  public void displayFromtail() {
    ListNode temp = tail;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.previous;
    }
    System.out.print("null \n");
  }

  /**
   * insert node at the end of list
   */
  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if (isEmpty()) {
      head = newNode;
    } else {
      tail.next = newNode;
      newNode.previous = tail;
    }
    tail = newNode;
    lenght++;
  }

  /**
   * insert node at the beginning of list
   */
  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    //head and tail point to null when list is null
    if (isEmpty()) {
      tail = newNode;
    } else {
      head.previous = newNode;
    }
    newNode.next = head;
    head = newNode;
    lenght++;
  }

  /**
   * delete node at the beginning of list
   */
  public ListNode deletehead() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode temp = head;
    if (head == tail) {
      tail = null;
    } else {
      head.next.previous = null;
    }
    head = head.next;
    temp.next = null;
    lenght--;
    return temp;
  }

  public ListNode deletetail() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode temp = tail;
    if (head == tail) {
      head = null;
    } else {
      tail.previous.next = null;

    }
    tail = tail.previous;
    temp.previous = null;
    lenght--;
    return temp;
  }


  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();

    dll.insertFirst(9);
    dll.insertFirst(23);
    dll.insertLast(90);
    System.out.print("Main List : ");
    dll.displayFromhead();
    System.out.print("Delete head : ");
    dll.deletehead();
    dll.displayFromhead();
    System.out.print("Delete tail : ");
    dll.deletetail();
    dll.displayFromhead();
  }
}

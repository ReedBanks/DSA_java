public class FixedSizeLinkedList  {
  private Node head;
  private int size;
  private int maxSize;

  public  FixedSizeLinkedList(int maxSize) {
    if (maxSize <= 0) {
      throw new IllegalArgumentException("Max size must be greater than zero");
    }
    this.maxSize = maxSize;
  }


  public void add(int element) {
    if (size >= maxSize) {
      throw new IllegalStateException("Fixed size limit reached");
    }
    Node newNode = new Node(element);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
    size++;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Node current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.data;
  }

  public int size() {
    return size;
  }

  private static class Node {
    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public boolean isEmpty(){
    return size()==0;
  }
  public void display(){
    if(isEmpty()){
      throw new RuntimeException("List is Empty.");
    }
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" => ");
      temp=temp.next;
    }
    System.out.print("null");
  }
  public static void main(String[] args) {
    // Creating a FixedSizeLinkedList with a maximum size of 5
    FixedSizeLinkedList list = new FixedSizeLinkedList(5);

    // Adding data to the list
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(23);

    // Displaying the size of the list
//    System.out.println("Size of the list: " + list.size());

    // Accessing and printing elements of the list
    System.out.println("Elements of the list:");
   list.display();
}
}

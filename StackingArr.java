public class StackingArr {
  //Stack implementation using arrays

  public static class Stack {
    private int top;
    private int[] arr;
    Stack(int capacity) {
      top = -1;
      arr = new int[capacity];
    }
    public Stack(){
      this(10);
    }

    public void push(int data) {
      top++;
      arr[top] = data;
    }
    public boolean isFull () {
      return arr.length == size();
    }

    public boolean isEmpty(){
      return size()<0;
    }
    public int size () {
      return top + 1;
    }

    public int pop(){
      if(isEmpty()){
        throw new RuntimeException("Stack is empty");
      }
      int result=arr[top];
      top--;
      return result;
    }
    public int peek(){
      if(isEmpty()){
        throw new RuntimeException("Stack is empty");
      }

      return arr[top];
    }

  }


  public static void main(String[] args) {

    Stack nos=new Stack(5);
    nos.push(8);
    nos.push(9);
    System.out.println(nos.peek());


  }
}

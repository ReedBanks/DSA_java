package heapify;

public class MaxHeap {
    // Priority queue allows to access max and min elements at constant time
    // Implementation of the max heap using arrays

    private Integer[] heap;
    private int size; //heap size

    MaxHeap(int capacity){
        heap=new Integer[capacity+1]; // bcos index 0 is kept as empty
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        MaxHeap queue1=new MaxHeap(3);
        System.out.println(queue1.getSize());
        System.out.println(queue1.isEmpty());
    }
}

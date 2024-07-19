package heapify;

public class MaxHeap {
    // Priority queue allows to access max and min elements at constant time
    // Implementation of the max heap using arrays

    private Integer[] heap;
    private int size; //heap size

    MaxHeap(int capacity){
        heap=new Integer[capacity+1]; // bcos we are keeping index 0 as empty
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }

    //insertting elements in queue
    public void insert(int x) {
        // check if array can accomdate a new value
        if (size == heap.length - 1) {
            //resize array to 2x its lenght if full
            resize(2 * heap.length);
        }
        //if array is not full yet

        //value is added to end be4 swimimg heapify
        size++;
        heap[size]=x;
        //performing bottomup heapify
        swim(size);
    }
    //resize method
    private void resize(int capacity){
        Integer[] temp=new Integer[capacity];
//        int i=0;
        for( int i : heap){
            temp[i]=heap[i];
        }
        heap=temp;
    }

    // verify input to match max heap by comparing to parent
    private void swim(int _size){
        while(_size > 1 && heap[_size/2]<heap[size]){
int temp=heap[_size];
heap[_size]=heap[_size/2];
heap[_size/2]=temp;
_size=_size/2;

        }
    }

    //print maxheap
    public void printMaxHeap(){
        for (int i = 1; i <=size ; i++) {
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        MaxHeap queue1=new MaxHeap(7);
//        System.out.println(queue1.isEmpty());
        queue1.insert(1);
        queue1.insert(2);
        queue1.insert(5);
        queue1.insert(10);
        queue1.insert(6);
        queue1.printMaxHeap();
       // System.out.println(queue1.getSize());
    }
}

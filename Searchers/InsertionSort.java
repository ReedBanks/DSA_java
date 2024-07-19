package Searchers;

public class InsertionSort {
    // divde array into sorted and unsorted parts
    // iterate and compare values from unsorted part when inserting in the sorted part
public static void Insertion_Sort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;
    }
    for(int val:arr){
        System.out.print(val +" ");
    }
}

    public static void main(String[] args) {
        int[] arr=new int[]{10,9,5,2,1};
        Insertion_Sort(arr);
    }
}

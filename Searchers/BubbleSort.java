package Searchers;

public class BubbleSort {
    //compare adjancent elements and swap them if sorted
    //using bool to keep track of iteration
    // outer loop keeps track of iteration && inner helps in comporison of elements
    public static void BubSort(int[] arr){
        boolean isSwapped;
        for (int i = 0; i < arr.length-1; i++) {
            isSwapped=false;
            for (int j = 0; j < arr.length-1-i; j++) {
               if(arr[j]>arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                   isSwapped = true;
               }
            }
            if(!isSwapped)break;
        }
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] newArr={4,5,2,1,3,9,10,7};

        BubSort(newArr);
    }
}

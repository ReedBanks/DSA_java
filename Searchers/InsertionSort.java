package Searchers;

public class InsertionSort {
    // divde array into sorted and unsorted parts
    // iterate and compare values from unsorted part when inserting in the sorted part
    //iteration starts from index 1 since we assume index 0 is already at it soted position
public static void Insertion_Sort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;
    }
   PrintArray(arr);
}

public static void PrintArray(int[] arr){

            for(int val:arr){
                System.out.print(val +" ");
            }

    }

//similar to insertion but
    // we iterate unsorted prt to find the minimum value and append to sorted part
//iteration starts from index 0
    public static void SelectionSort(int[] arr){
    int size= arr.length;
        for (int i = 0; i <size-1 ; i++) {
            int min=i;
            for (int j =i+1; j <size ; j++) {
                if(arr[j]<arr[min]){
                   min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    PrintArray(arr);
    }


    //Merging two sorted arrays
public static int[] ArrMerger(int[] arr1,int[] arr2){
    int arr1Size=arr1.length;
    int arr2Size=arr2.length;
    int[] result=new int[arr1Size+arr2Size];
    int i=0,j=0,k=0;
    // i to traverse arr1
    // j to traverse arr2
    // k to traverse arr3

    while(i<arr1Size && j < arr2Size) {
        if (arr1[i] < arr2[j]) {
            result[k] = arr1[i];
            i++;
        } else {
            result[k] = arr2[j];
            j++;
        }
        k++;
    }
    //appending remaining elements if any was left
    while(i<arr1Size){
        result[k]=arr1[i];
        i++;k++;
    }
    while(j<arr2Size){
        result[k]=arr2[j];
        j++;k++;
    }
    return result;
}


    public static void main(String[] args) {
        int[] arr1=new int[]{10,9,5,2,1,11};
        int[] arr2=new int[]{16,1,33,22,4};
        System.out.print("Before swap : ");PrintArray(arr1);
        System.out.print("\nInsertion Sort swap : ");Insertion_Sort(arr1);
        System.out.print("\nBefore swap : ");PrintArray(arr2);
        System.out.print("\nSelection Sort swap : ");SelectionSort(arr2);
        int[] sort1={1, 2, 5, 9, 10, 11 };
        int[] sort2={1 ,4 ,16 ,22 ,33 };
        System.out.println("\n");
        PrintArray(ArrMerger(sort1,sort2));
    }
}

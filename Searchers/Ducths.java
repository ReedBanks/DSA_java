package Searchers;

public class Ducths {
    //program to sort array of 0,1,2
    public static void numSorts(int[] arr){
        int i=0,j=0,k=arr.length-1;
        // j to keep track of 0
        // i to keep track of 1
        // k to keep track of 2
        while(i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                j++;
            } else if (arr[i]==1) {
                i++;
            }
            else if(arr[i]==2){
                swap(arr,i,k);
                k--;
            }
                // we dont decrement when swap i and k cos we dont know the value of k
        }
    }

    public static void swap(int[] arr,int i,int value){
        int temp=arr[i];
        arr[i]=arr[value];
        arr[value]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,0,2,2,0,1,1};
        numSorts(arr);
        InsertionSort.PrintArray(arr);
    }
}

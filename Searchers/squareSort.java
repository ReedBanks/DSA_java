package Searchers;

public class squareSort {
    //square elemeents of a sorted array and return a sorted arry
    public static int[] SquareSort(int[] arr){
        int[] results=new int[arr.length];
        int i=0,j=arr.length-1;
        for(int k=results.length-1;k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                results[k]=arr[i]*arr[i];
                i++;
            }
            else{
                results[k]=arr[j]*arr[j];
                j--;
            }
        }
    return results;
    }

    public static void main(String[] args) {
        int[] arr={-4,-2,1,3,10};
        InsertionSort.PrintArray(SquareSort(arr));
    }
}

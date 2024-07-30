package Searchers;

public class MergeSort {
    //implements the divide and conquer algorithm
    //  division is done till last single element but conquering is down using the 3 counter method
    //case 1 => left array exhauted :
        // dont do anything since position of element remains same in sorted array
    //case 2 => right array exhauted :
    //  copy remaining elements to their respective places

    public static void mergesortin(int[] arr1,int[] temp,int low,int high){


        if(low < high){
            int mid=low+(high-low)/2; // this eqn helps avoid garbage values when dealing with large arrays
            mergesortin(arr1,temp,low,mid); //left part
            mergesortin(arr1,temp,mid+1,high);//right part
            merger(arr1,temp,low,mid+1,high);//sort merging

        }
    }

    private static void merger(int[] arr1, int[] temp, int low,int mid, int high) {
        //copy org arrray into temp (low => high)
        for (int i =low; i <=high ; i++) {
            temp[i]=arr1[i];
        }
        //main meger
        int i=low,j=mid+1,k=low; //
        while(i<=mid && j<=high){
            if(temp[i] <=temp[j]){
                arr1[k]=temp[i];
                i++;
            }else{

                arr1[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr1[k]=temp[i];
            i++;k++;
        }

    }


    public static void main(String[] args) {
        int[] arr1=new int[]{10,9,5,2,1,11};
        int[] arr2=new int[]{16,1,33,22,4};
        mergesortin(arr1,new int[arr1.length], 0,arr1.length-1);
        InsertionSort.PrintArray(arr1);

    }
}

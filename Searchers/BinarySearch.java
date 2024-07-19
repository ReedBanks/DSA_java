package Searchers;

import trees.BinSearchTree;

public class BinarySearch {
    public static int BinSearch(int[] arr ,int key){
        int low=0;
        int high=arr.length-1;
        //divde arr into halves and find key
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid]==key)return mid;
            if(key<arr[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
return -1;

    }

    //function to search for key or predict where it should have been if not found
    public static int SearchPredict(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2; // this expression retricts the bound of mid within the arr
            if(key == arr[mid]) return mid;
            if(key<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,7,8,11,12,14,15,16};


        System.out.println("key : 5 index :"+BinSearch(arr,5));
        System.out.println("Search Index : "+ SearchPredict(arr,9));
    }
}

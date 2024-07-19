package Searchers;

public class LinearSearching {
    public static int search(int[] arr,int limit,int key){
        for(int i=0;i<limit;i++){
            if(arr[i]==key) {
                System.out.println("Key Found at index : " + i);
                return key;
            }
        }
return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        search(arr,8,4);
    }
}

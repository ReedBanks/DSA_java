public class MinValue_arr {
//  program to find the minimum value in an arr

  public static void main(String[] args) {
   int[] arr={10,9,8,7,6,5,4,3,2};

    System.out.println("Min value : "+findMin(arr));
  }

  public static int findMin(int arr[]){
//    setting `1st elemet as min value
    int min=arr[0];
//    perform iteration to compare values and find min
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }

    return min;
  }

}

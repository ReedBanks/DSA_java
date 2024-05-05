public class RemoveEvenInteger {
  public static void main(String[] args) {
// program to remove even integers from array
int[] arr={1,2,3,4,5,6,7,8,9,10};
Print_Array(Remove_Even(arr));



  }

  /**
   * method to remove even integer in arr **/
  public static int[] Remove_Even(int[] arr) {

//    count number of odd integers
  int oddCount=0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]%2 !=0){
        oddCount++;
      }
    }
//    create array of length odd count
    int[] result=new int[oddCount];
    int index=0;
//    add odd values to result array
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]%2 !=0){
        result[index]=arr[i];
        index++;
      }

    }
    return result;
  }

  public static void Print_Array(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
  }

}


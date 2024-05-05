public class Array_resizing {
//  init array
//  create a temp array with new size
//  move data from old arrat to new array
//  return new array
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println(arr.length);
    PrintArray(arr);
    resize(arr,9);

   arr[5]=89;
    PrintArray(arr);

//    System.out.println(arr.length);

  }
  public static int[] resize(int[] arr,int capacity){
    int[] temp=new int[capacity];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    return temp;
  }

  private static void PrintArray(int[] array) {
    int n=array.length;
    for (int i = 0; i < n; i++) {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}

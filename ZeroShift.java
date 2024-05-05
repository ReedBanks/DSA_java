public class ZeroShift {
//  program to shift 0 elements of an array to it's end whiles maintaining its order

public static void main(String[] args) {
//  initiate an array
//  pass array to func
//  sought out array using a for loop
//  return new array

int[] arr={1,0,3,0,4,0,12,0};

  PrintArray(arr);

  PrintArray(ZeroShifter(arr));

}

  private static void PrintArray(int[] array) {
  int n=array.length;
    for (int i = 0; i < n; i++) {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }

  public static int[] ZeroShifter(int[] array){
  int j=0; //focus on zero elements

  for(int i=0;i<array.length;i++){
//i will focus on non-zero elements
    if(array[i] != 0 && array[j] ==0){
     int temp=array[i];
      array[i]=array[j];
      array[j]=temp;
    }
    if(array[j] !=0 ){
      j++;
    }
  }
  return array;
}


}


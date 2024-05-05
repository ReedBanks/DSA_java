public class SecMax {
//  program to find the second max element in an array
public static void main(String[] args) {
  int[] arr={2,1,4,5,6,3,99,8};

  System.out.println("SecondMax value : "+ FindSecondMax(arr));

}

public static int FindSecondMax(int[] array){
  int SecondMax=Integer.MIN_VALUE;//smallest integer value
  int max=Integer.MIN_VALUE;//smallest integer value

//looping through
  for(int i=0;i<array.length;i++){
    //  find the max value and assign it's previous value to the secondMax 
    if(array[i]>max){
      SecondMax=max;
      max=array[i];
    }
//    assign value to secondMax if is greater than it
    else if (array[i]>SecondMax && array[i] != max) {
      SecondMax=array[i];
    }
  }

  return SecondMax;
}

}

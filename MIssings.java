public class MIssings {
//  program to find the missing number in an array of counting numbers
//declare arr
//  define method to count and find missing value
//  return missing value
  public static void main(String[] args) {
    int[] arr={1,2,3,4,7,8,6};

    System.out.println( FindMissingValue(arr));
  }
  public static int FindMissingValue(int[] array){
    int n=array.length+1;
    int sum=n*(n+1)/2;
    for(int num:array){
      sum -=num;
    }

    return sum;
  }
}

package Algorithm_Analysis;

public class SpaceComplexity {
  //  memory taken for an algo to complete a task
    public static void main(String[] args) {

    }
    //first method
    //  this is 
/*
public int findSum(int value){
  return value*(value+1)/2;
}
*/

    //2nd method
    //

    public int findSum(int value){
      int sum=0;
      for (int i=1;i<=value;i++){
        sum=sum+i;
      }
      return sum;
    }
  }



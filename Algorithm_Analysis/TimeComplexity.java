package Algorithm_Analysis;

public class TimeComplexity {
//  time taken for an algo to complete a task
public static void main(String[] args) {

//  recording time at start of program
  double now=System.currentTimeMillis();

  TimeComplexity demo=new TimeComplexity();
  System.out.println(demo.findSum(99999));

  System.out.println("Time taken : "+(System.currentTimeMillis()-now)+" millisecs");
}

//first method
//  this is more
/*
public int findSum(int value){
  return value*(value+1)/2;
}
*/

  //2nd method
//  the time taken varies from machine to machine

  public int findSum(int value){
    int sum=0;
    for (int i=1;i<=value;i++){
      sum=sum+i;
    }
  return sum;
  }
}

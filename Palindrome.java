public class Palindrome {
  public static void main(String[] args) {
    String madam="madam";
    String doctor="doctor";


//    program to check if a string is a palindrome
    System.out.println(palindromeCheck(madam));
    System.out.println(palindromeCheck(doctor));
    System.out.println(palindromeCheck("moom"));
  }
  public static boolean palindromeCheck(String value){
    char[] arr=value.toCharArray(); //converting to array
    int start=0;
    int end=arr.length-1;
    while(start < end){
      if(arr[start] != arr[end]){
      return false;
      }
      else{
        start++;
        end--;
      }    }
    return true;
  }
}

import java.util.Stack;

public class ReverseStringStack {

public static String reverse(String str){
  Stack<Character> newStack =new Stack<>();
  char[] chars=str.toCharArray();
  for(char c : chars){
    newStack.push(c);
  }
  for(int i=0;i<str.length();i++){
    chars[i]=newStack.pop();
  }
  return new String(chars);
}

  public static void main(String[] args) {
    String word="admino";
    System.out.println(reverse(word));


  }
}

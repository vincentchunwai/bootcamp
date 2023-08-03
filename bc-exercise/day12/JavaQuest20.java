/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()){
      return false;
    }
    for (int i = 0; i < s.length(); i++) {
      String rotated = s.substring(i) + s.substring(0, i);
      if (rotated.equals(goal)) {
        return true;
      }
    }
    return false;

  }
  
  

  private static int wrapAround(int start, int length){
    return (start % length + length) %length;
  }

}


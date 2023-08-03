/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    int i = 0;
    int j = 0;
    int Vowels1 = 0;
    int Vowels2 = 0;
    String firstHalf = s.substring(0, s.length()/2);
    char[] first = firstHalf.toCharArray();
    String SecondHalf = s.substring(s.length()/2);
    char[] Second = SecondHalf.toCharArray();
    while (i < first.length && j < Second.length){
      if (IsLowerCaseVowels(first[i]) == true){
        Vowels1++;
      }
      if (IsLowerCaseVowels(Second[j]) == true){
        Vowels2++;
      }
      i++;
      j++;
    }
    if (Vowels1 == Vowels2){
      return true;
     } else {
      return false;
     }
    }

    public static boolean IsLowerCaseVowels(char ss){
      char result = Character.toLowerCase(ss);
      return result == 'a'|| result == 'e'|| result =='i'|| result =='o'|| result =='u';
    }
}


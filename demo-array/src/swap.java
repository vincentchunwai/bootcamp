public class swap {
  public static void main(String[] args){
    int[] arr = new int[] {100, -400, 3, 99};
    int temp = 0;
    temp += arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1] = temp;
    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    String swapped = SwapOddEvenCharacter("abcdefg");
    System.out.println(swapped);
    String str2 = String.valueOf(123);// "123"
    char str3 = 'g';
    String str4 = "";
    str4.concat(String.valueOf(str3));
    System.out.println(str4);
  }

  public static String SwapOddEvenCharacter(String str){
    char[] charStr = str.toCharArray();
    // hello! -> ehll!o
    // abcd -> badc
    // aabb -> aabb
    for (int i = 0; i < str.length()-1; i+=2){
      char temp = charStr[i];
      charStr[i] = charStr[i+1];
      charStr[i+1] = temp;
    }
    String swapped = "";
    for (int i = 0; i < charStr.length; i++){
       swapped += charStr[i];
    }
    "123".isEmpty();
    return String.valueOf(charStr);
    
    
  }
  
}

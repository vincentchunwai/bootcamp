public class loop2 {
  public static void main(String[] args) {
    /*
     * for (int i = 0; i < 6; i++){
     * for (int j = 0; j < 3; j++){
     * System.out.println("i=" + i + "j=" + j);
     * if (i == j){
     * break; // this break statement just break the inner loop
     * }
     * }
     * }
     */
    // i = 0, j = 0, yes, break
    // i = 0, j = 1, no
    // i = 0, j = 2, no
    // i = 1, j = 0, yes
    // i = 1, j = 1, yes, break
    // i = 2, j = 0, yes
    // i = 2, j = 1, yes
    // i = 2, j = 2, yes
    // i = 3, j = 0, yes
    // i = 3, j = 1, yes
    // i = 3, j = 2, yes
    // i = 4, j = 0, yes
    // i = 4, j = 1, yes
    // i = 4, j = 2, yes
    // i = 5, j = 0, yes
    // i = 5, j = 1, yes
    // i = 5, j = 2, yes

    // continue
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          continue;// skip the rest in inner loop, go to next iteration
        }
        System.out.println("i=" + i + "j=" + j);
      }
    }
    // i = 0, j = 0 : continue
    // i = 1, j = 0 : skipped
    // i = 1, j = 1 : continue

    String str = "I love programming. I love Java. hello";
    System.out.println("str length =" + str.length());
    int howManyLetter = 0;
        char e = 'e';

    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == e) {
        howManyLetter = i;
        System.out.println("how many letter before the string reach e = " + howManyLetter);
        break;
      }
    }
    boolean found = false;

    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'y')
      found = true;
      break;}
      if (found){
        System.out.println("Found");
      } 
      else {System.out.println("Not Found");}

      char target = 'c';
      int occurence = 0;
      

      for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == target){
          occurence++;
          found = true;
        }
      }
      if (found = true){
        System.out.println("occurence of " + target + "=" + occurence);
      } else {System.out.println("Not found");}


    }

  }



public class CharacterAnalysis {

  public void checkChar(char Anychar){
    if (Character.isUpperCase(Anychar)){
      System.out.println("this is an upper case character");
    } else if (Character.isLowerCase(Anychar)){
      System.out.println("this is a Lower case character");
    } else if (Character.isDigit(Anychar)){
      System.out.println("this is a digit");
    } else {System.out.println("this is special character");}
  }
  
}

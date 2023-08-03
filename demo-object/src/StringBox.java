import java.util.Arrays;
import Shape.Square;

public class StringBox {
  private String string;


  // constructor, getter, setter

  /*
   * public StringBox(){
   * 
   * }
   */

  public StringBox(String string) {
    if (string == null)
      this.string = "";
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }
   public String toString() {
    return this.string;
  } 

  public StringBox append(String str) {
    if (str == null || "".equals(str))
      return this;
    this.string = this.string + str;
    return this;
  }
  public char[] toCharArray(){
    char[] result = new char[this.string.length()];
    for (int i = 0 ; i < this.string.length(); i++){
      result[i] = this.string.charAt(i);
    }
    return result;
  }


  public StringBox insert(int idx, String s) {
    if (idx < 0 || idx > this.string.length())
      return this;
    if (s == null || "".equals(s))
      return this;
    this.string =
        this.string.substring(0, idx) + s + this.string.substring(s.length());
    return this;
  }
  /*
   * public static StringBox append(String str1, String str2){ return new StringBox(str1+" "+str2); }
   */

  public static void main(String[] args) {
    StringBox stringBox = new StringBox(""); // empty constructor
    stringBox.setString("JAVA");
    System.out.println(stringBox.append(" Python").append(" HTML"));
    System.out.println(stringBox.append("Box"));
    System.out.println(stringBox);
    System.out.println(stringBox.toString());
    System.out.println(stringBox);
    System.out.println(Arrays.toString(stringBox.toCharArray()));

    Square s2 = Square.of(4);

    /*
     * stringBox.insert(5, "hello"); System.out.println(stringBox);
     * 
     * StringBox s2 = new StringBox(""); s2.insert(3, "java"); System.out.println(StringBox.append("Hello", "World"));
     */
  }
}

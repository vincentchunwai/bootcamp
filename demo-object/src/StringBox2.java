import java.util.Arrays;

public class StringBox2 {
  private char[] string;

  public StringBox2 (char[] sources){
    //approach 1
    /* this.string = new char[sources.length];
    /* for (int i = 0 ; i < sources.length; i++){
      string[i] = sources[i];
    } */
    // approach 2
    //copyOf() -> new array object, with the copy values of the original array
    this.string = Arrays.copyOf(sources, sources.length);
  }

  public StringBox2 append(String s){
    s.toCharArray();
    char[] res = new char[this.string.length + s.length()];
    int idx = 0;
    int j = 0;
    while (idx < this.string.length){
      res[idx] = this.string[j] ;
      idx++;
      j++;
    }
    j = 0;
    while (idx < res.length){
      res[idx] = s.charAt(j);
      idx++;
      j++;
    }
    this.string = res;
    return this;
  }
  public char[] getStringBox(){
    return this.string;
  }

  public void setStringBox(char[] string){
    this.string = string;
  }

  public String toString(){
    return String.valueOf(this.string);
  }

  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'c', 'b'};
    StringBox2 box = new StringBox2(chars);
    System.out.println(box.toString()); //{a, c, b}

    chars[1] = 'x'; 
    System.out.println(String.valueOf(chars)); //{a, x, b}
    System.out.println(box.toString()); //{a, c, b}
    StringBox2 box2 = new StringBox2(String.valueOf(box).toCharArray());
    System.out.println(box2);
    System.out.println(box.append("def").toString());
    System.out.println(chars);
  }
}

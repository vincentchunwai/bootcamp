import java.util.Arrays;

public class StringBuilder1 {
  public static void main(String[] args){
    String str4 = "world";
    StringBuilder sb = new StringBuilder();
    sb.append("hello"); //append() is faster than "+" in String
    System.out.println(sb.toString());
    sb.delete(3, 6);
    System.out.println(sb.toString());
    sb.replace(3, 6,"world");
    System.out.println(sb.toString()); 
    sb.append(1.3f);
    System.out.println(sb.toString());
    sb.reverse();
    sb.append(str4.substring(0, 3));
    System.out.println(sb);
    sb.append(true).append(400).insert(8, "gkk");
    System.out.println(sb.toString());

    String s = " he llo ";
    int i = 0;
    String[] strs = s.trim().replace('h', 'e').split(" ");
    System.out.println(Arrays.toString(strs));

    //insert
    String s10 = "hello";
    StringBuilder s11 = new StringBuilder(s10);
    s11.insert(3, ' ');
    System.out.println(s11.toString());

    char x = sb.append(strs[0].substring(0, 1)).toString().charAt(6);
    System.out.println(x);

    s11.insert(0, "world").append("world");
    System.out.println(s11.toString());
    s11.delete(7, 20);    // Pass by reference
    System.out.println(s11.toString());
    String[] str5 = Arrays.copyOf(strs, strs.length+1);
    System.out.println(Arrays.toString(str5));
    String ss = "abacbc";
    char[] sss = ss.toCharArray();
    Arrays.sort(sss);
    System.out.println(Arrays.toString(sss));


    System.out.println(s11.deleteCharAt(3).toString());

    Integer a = 10;
    System.out.println(a + 10); // Pass by value
    // a = 10
    s11.setCharAt(4, 'J');
    System.out.println(s11.toString());
    String s12 = s11.substring(2);
    System.out.println(s12);
  }
  
}

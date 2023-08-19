import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
public class DemoArrayList2 {
  
  public static void main(String[] args){
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    System.out.println(strs.subList(1, 2));
    //strs = (ArrayList) strs.subList(1,2);
    System.out.println(strs);
    List<String> sstr = new ArrayList<>(strs.subList(2, 3)); // subList return List
    System.out.println(sstr);
    // Remove the first occurence of "def"
    strs.remove("def"); // remove by Object
    System.out.println(strs); //[abc, xyz, def] resized
    strs.remove(1); // overloading
    System.out.println(strs);

    Iterator<String> iterator = strs.iterator();
    while(iterator.hasNext()){
      System.out.print(iterator.next() + " ");
    }
    System.out.println();

    for (String s : strs){ // for-each support Array and ArrayList
      System.out.print(s + " ");
    }
    System.out.println();

    String[] str = new String[strs.size()];
    str = strs.toArray(str);
    System.out.println(Arrays.toString(str));

    Object[] objects = strs.toArray(); // ArrayList<String> -> Object[]
    for(Object o : objects){
      if (o instanceof String){
        String str1 = (String) o;
        System.out.println(str1); 
      }
    }

    String[] strings = new String[] {"hello", "world", "!"};

    List<String> s2 = new ArrayList<>();
    s2.add("abc"); // add() method must be reflecting the add() in ArrayList<>()

    List<String> stringList = Arrays.asList(strings); // Arrays.asList() return an ArrayList with fixed size
    ArrayList<String> stringCopy = new ArrayList<>(stringList);
    System.out.println(stringCopy);
    stringCopy.add("123");
    System.out.println(stringCopy);

    // Read Only -> big bug
    /* List<String> StringList = Arrays.asList(strings);
    stringList.add("ijk"); */

    // Read & Write
    List<String> stringList2 = new ArrayList<>(Arrays.asList(strings));
    stringList2.add("ijk");
    System.out.println(stringList2);
  }
}

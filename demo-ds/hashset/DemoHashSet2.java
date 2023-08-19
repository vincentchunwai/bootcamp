import java.util.HashSet;

public class DemoHashSet2 {
  public static void main(String[] args) {
    
    HashSet<Byte> bytes = new HashSet<>();
    bytes.add(convertByte(4));
    boolean isAdded10 = bytes.add(convertByte(10));

    boolean isAdded4 = bytes.add(convertByte(4));
    System.out.println(isAdded4);

    HashSet<Byte> bytes2 = new HashSet<>();
    bytes2.add(convertByte(4));
    bytes2.add(convertByte(10));

    System.out.println(bytes.equals(bytes2));

    boolean isRemoved10 = bytes2.remove(convertByte(10));
    System.out.println(isRemoved10);
  }

  public static Byte convertByte(int num){
    return Byte.valueOf((byte) num);
  }
  
}

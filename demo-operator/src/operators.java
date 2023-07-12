public class operators {
  public static void main(String[] args) {
    int a = 1;
    a = a + 1;
    a = a - 2;
    int b = 10 / 5;
    b = b * 3 + 5;
    System.out.println("a+b =" + a + b);

    int x = 1;
    x = x + 1;
    x++; // means x = x + 1;
    ++x; // means x = x + 1;
    x += 1;
    System.out.println("x=" + x); // x=5

    int y = 10;
    y = y - 1;
    y--;
    --y;
    System.out.println("y=" + y); // y = 6

    int z = 4;
    z = z + 2;
    z += 2;
    int i = 6;
    
    int w = 9;
    w = w * 3;
    w *= 3;
    int u = 81;
    u = u/9;
    u /= 3;

    int integer =  12%5;
    int integer2 = 12;
    integer2 %= 5;

    int m = 3;
    m++; // 4
    int preIncrement = ++m; 
    System.out.println("preIncrement = " + preIncrement);
    int postIncrement = m++;
    System.out.println("postIncrement = " + postIncrement);
    String str = "Hello";

    str += "world";
    System.out.println(str);

    

  

    }
  }



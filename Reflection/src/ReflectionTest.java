import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
  
  public static void main(String[] args) throws Exception{
    MyCat cat = MyCat.of("Stella", 6);
    Field[] catFields = cat.getClass().getDeclaredFields();

    for (var field: catFields ){
      if (field.getName().equals("name")){
        field.setAccessible(true);
        field.set(cat, "Jimmy McGill");
      }
    }
    System.out.println(cat.getName());

    Method[] catMethods = cat.getClass().getDeclaredMethods();

    for (Method method: catMethods){
       System.out.println(method.getName());
       if (method.getName().equals("of")){
        method.invoke(null);
       }
    }
  }
}

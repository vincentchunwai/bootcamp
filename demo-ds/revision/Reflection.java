import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception {
        // Get the class object using its fully qualified name
        Class<?> myClass = Class.forName("com.example.MyClass");

        // Create an instance of the class using reflection
        Object instance = myClass.getDeclaredConstructor().newInstance();

        // Get a method using its name and parameter types
        Method method = myClass.getMethod("myMethod", String.class);

        // Invoke the method on the instance
        method.invoke(instance, "Hello, Reflection!");

        
    }
}

class MyClass {
    public void myMethod(String message) {
        System.out.println(message);
    }
}


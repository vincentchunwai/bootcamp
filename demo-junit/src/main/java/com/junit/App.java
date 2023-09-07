package com.junit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int add(int x, int y){ // App.add(1, 2)
        if (x > y)
        return x + y + AnotherMethod(x + y); // let anotherMethod(x, y) = 1

        return x + y;
    }

    public static int AnotherMethod(int k){
        return (k + 2) / 100;
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

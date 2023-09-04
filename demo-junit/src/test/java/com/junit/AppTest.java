package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
 class AppTest {

  private int x;
  
  @Test
  void testAssertEqual(){
    // Assertions.assertEquals(expected value, actual value)
    assertEquals(5, App.add(2, 3));
    assertEquals(13, App.add(10, 3));
    assertEquals(24, App.add(21, 3));
    assertEquals(4, App.add(1, 3));
    assertEquals(-5, App.add(-2, -3));
    assertEquals(1, App.add(-2, 3));
    x++;
    assertEquals(1, x);
  
  
  }
  void testAssertNotEquals(){
    assertNotEquals(4, App.add(1,2));
    assertNotEquals(3, App.add(-1,2));
    assertNotEquals(5, App.add(4,0));
    assertNotEquals(2, App.add(1,2));
  }

  public static void main(String[] args) {
    new AppTest().testAssertEqual();
    new AppTest().testAssertNotEquals();
  }
}

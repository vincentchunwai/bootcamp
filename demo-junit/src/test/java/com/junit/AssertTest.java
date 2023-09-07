package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
@DisplayName("Assert Method Test")
 class AssertTest {

  private int x;
  
  @Test
  @DisplayName("AssertEquals Test")
  void testAssertEqual(){
    // Assertions.assertEquals(expected value, actual value)
    assertEquals(5, App.add(2, 3));
    assertEquals(13, App.add(10, 3));
    assertEquals(24, App.add(21, 3));
    assertEquals(4, App.add(1, 3));
    assertEquals(-5, App.add(-2, -3));
    assertEquals(1, App.add(-2, 3));
    x++; // setting up a new x every time the test runs
    assertEquals(1, x);
  
  
  }

  void testAssertNotEquals(){
    assertNotEquals(4, App.add(1,2));
    assertNotEquals(3, App.add(-1,2));
    assertNotEquals(5, App.add(4,0));
    assertNotEquals(2, App.add(1,2));
    x++;
  }

  @Test
  @DisplayName("AssertNotNull Test")
  void tsetAssertNotNull(){
    Student student = new Student();
    assertNotNull(student.getSubjects());
  }

  @Test
  @DisplayName("AssertThrows Test")
  void testAssertThrows(){
    assertThrows(ArithmeticException.class, () -> {
      App.divide(10, 0);
    });

    assertDoesNotThrow(() -> {
      App.divide(10, 5);
    });
  }

  @Test
  void testAssertTimeout(){
    assertTimeout(Duration.ofMillis(100), () -> {
      Thread.sleep(50); /// ms
    });
  }

  @Test
  void testCombine(){
    assertAll(
      () -> assertTrue(10 > 3),
      () -> assertTrue(10 == App.add(4, 6)),
      () -> assertNull(null)
    );
  }

  @Test
  void testNotSame(){
    String s1 = new String("JUnit");
    String s2 = new String("JUnit");
    assertNotSame(s1, s2);
    assertEquals(s1, s2);

    String s3 = "JUnit";
    String s4 = "JUnit";
    assertSame(s3, s4);
    assertEquals(s3, s4);
  }

  public static void main(String[] args) {
    new AssertTest().testAssertEqual();
    new AssertTest().testAssertNotEquals();
  }
}

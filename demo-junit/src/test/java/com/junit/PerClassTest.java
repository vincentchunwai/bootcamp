package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class PerClassTest {
  private int x;

  @Test
  @Order(2)
  void test1(){
    x++;
    Assertions.assertEquals(2, x);
  }

  @Test
  @Order(1)
  void test2(){
    x++;
    Assertions.assertEquals(1, x);
  }

  @Test
  void testAssertTrue(){
    Assertions.assertTrue(12 == App.add(7, 5));
  }

  @Test
  void testAssertFalse(){
    assertFalse(13 == App.add(7, 5));
  }

  @Test
  void testAssertNull(){
    String str = null;
    
  }
}

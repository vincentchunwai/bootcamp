package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)

class BeforeTest {
  
  private int x;

  @BeforeEach
  void beforeEach(){
    assertEquals(0, this.x);
    x+=3;
  }

  @AfterEach
  void endOfTest(){
    System.out.println("end of test starts");
    this.x -= 2;
    System.out.println(x);
  }

  @Test
  void testAdd(){
    assertEquals(8, App.add(this.x, 5));
  }

  @Test
  void testAdd2(){
    assertEquals(8, App.add(this.x, 5));
  }


}

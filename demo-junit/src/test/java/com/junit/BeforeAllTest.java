package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BeforeAllTest {
  
  @org.junit.jupiter.api.BeforeAll
  static void beforeAll(){
    System.out.println("beforeAll start");
  }

  @AfterAll
  static void afterAll(){
    System.out.println("afterAll start");
  }

  @Test
  void assertTest(){
    Assertions.assertTrue(true);
  }
}

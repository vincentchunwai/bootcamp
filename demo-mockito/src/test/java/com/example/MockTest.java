package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockitoSession;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.example.com.example.Calculator;
import com.example.com.example.CheckOut;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.WARN)
public class MockTest {
  
  @Mock
  Calculator calculator;

  @Mock
  Calculator calculator2;

  @InjectMocks
  CheckOut checkOut;

  @Test
  void testSubstract(){
    Calculator selfnew = new Calculator(3);
    assertEquals(-7, calculator.substract(10, 6));
    assertEquals(6, selfnew.multiply(2, 3));
  }
  @Test
  void testAdd(){
    when(calculator.substract(3, 4)).thenReturn(100);

    //CheckOut checkout = new CheckOut(calculator);
    // Testing start
    int result = checkOut.add(3, 4);
    assertEquals(104, result);

    verify(calculator, times(1)).substract(3, 4);
  }
  @Test
  void testMultiply(){
    when(calculator.substract(7, 9)).thenReturn(10000);
    when(calculator.multiply(7, 9)).thenReturn(10000);
    int result = checkOut.multiply(7,9);
    assertEquals(10009, result);
  }
  @Test
  void testMultiply2(){
    when(calculator.substract(3, 8)).thenReturn(10000);
    //when(calculator.multiply(7, 9)).thenReturn(10000);
    int result = checkOut.multiply(3,8);
    assertEquals(8, result);
  }
   @Test
  void testAdd2(){
    when(calculator2.substract(0, 4)).thenReturn(1000);

    //CheckOut checkout2 = new CheckOut(calculator2);
    // Testing start
    int result = checkOut.add(0, 4);
    assertEquals(4, result);

    verify(calculator2, never()).substract(0, 4);
  } 

}

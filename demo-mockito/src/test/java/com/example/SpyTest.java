package com.example;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.com.example.Calculator;
import com.example.com.example.CheckOut;

@ExtendWith(MockitoExtension.class)
public class SpyTest {
  
  @Spy
  Calculator calculator;

  @InjectMocks
  CheckOut checkOut;

  @Test
  void testAdd1(){
    when(calculator.substract(3, 4)).thenReturn(100);
    int result = checkOut.add(3, 4);
    Assertions.assertEquals(104, result);
    verify(calculator, times(1)).substract(3,4);
  }

  @Test
  void testAdd2(){
    int result = checkOut.add(3,4);
    Assertions.assertEquals(5, result);
  }
  
  @Test
  void test3(){
    when(calculator.multiply(-2, 4)).thenReturn(100);
    int result = checkOut.multiply(3, 4);
    Assertions.assertEquals(104,result);
  }
}

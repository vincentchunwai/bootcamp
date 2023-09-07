package com.example.com.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculator {

  private int weight; 

  
  public int substract(int x, int y){
    return y - x - this.weight;
  }

  public int substract2(int x, int y){
    return y - x;
  }

  public int multiply(int x, int y){
    return x * y;
  }
}

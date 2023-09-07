package com.example.com.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CheckOut {
  
  @NonNull
  private Calculator calculator;

  public int add(int x, int y){
    if(x > 1){
      return y + this.calculator.substract(x, y);
    }
    return x + y;
  }

  public int multiply(int x, int y){
    if (x > 1){
      return y + this.calculator.multiply(x, y);
    } else if(x == 0){
      return y + this.calculator.substract(x, y);
    }

    return this.calculator.multiply(x, y) + this.calculator.substract(x, y);
  }

}

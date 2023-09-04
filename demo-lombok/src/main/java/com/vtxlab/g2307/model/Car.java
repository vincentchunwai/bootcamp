package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @AllArgsConstructor
// @NoArgsConstructor
@RequiredArgsConstructor

public class Car {

  @NonNull
  private int capacity;
  private final double weight;
  private String color;
  
  public Car(String color){
    this.color = color;
    this.weight = 0;
  }

  public static void main(String[] args) {
    Car car1=new Car("red");
    Car car2= new Car(3, 5.0);
  }

}

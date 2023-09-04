package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // The minimal args to create Student Object
@NoArgsConstructor
@AllArgsConstructor
public class Student {
  private int age;
  @NonNull
  private String name;


  public static void main(String[] args) {
    Student student = new Student(); // from @RequiredArgsConstructor
    Student s2 = new Student(10, "John");
  }
}

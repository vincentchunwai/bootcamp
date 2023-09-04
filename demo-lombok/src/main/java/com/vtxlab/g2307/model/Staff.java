package com.vtxlab.g2307.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode/* (callSuper = true) */
@SuperBuilder
@ToString
//@AllArgsConstructor // without call super
public class Staff extends Human{
  private double salary;

  // must manually code the constructor that includes Parent's attributes
  public Staff(String name, double salary){
    super(name);
    this.salary = salary;
  }
  
  public static void main(String[] args) {
    Staff s1 = new Staff("John", 30000.0);
    Staff s2 = new Staff("Peter", 30000.0);
    Staff s4 = new Staff(builder().self());
 
    System.out.println(s4);

    System.out.println(s1.equals(s2));
    Staff s3 = new StaffBuilderImpl().name("Joseph").salary(150000.0).build();

    // s3 = new StaffBuilder<Staff,StaffBuilder<String ,double>>
    
  }
}

package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // annotation
@NoArgsConstructor
@Setter
@Builder
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class PersonLombok{

  
  @Getter
  @ToString.Include
  private String name;

  @EqualsAndHashCode.Include
  private int age;

  public static void main(String[] args) {
    PersonLombok personLombok = new PersonLombok("Peter", 30);
    PersonLombok p2 = new PersonLombok();
    p2.setAge(13);
    p2.setName("Eric");
    //System.out.println(p2.getAge());
    System.out.println(p2.getName());
    PersonLombok p3 = new PersonLombokBuilder()
        .name("Johnny")
        .age(13)
        .build();
    System.out.println(p3);
    System.out.println(p3.equals(p2));

  }
}

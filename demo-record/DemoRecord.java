public class DemoRecord {
 
  public static void main(String[] args) {
    Person person = Person.of("john", 30);
    Person1 person1 = new Person1("Bill", 32, 10);
    Person1 anotherPerson = new Person1("Bill", 32, 10);
    Person person3 = Person.of("Pat", 23);

    

    System.out.println(person1.equals(anotherPerson));
    System.out.println(person1);
    System.out.println(person1.hashCode() == anotherPerson.hashCode());
    // already Override the equals , toString and hashcode;
  }
}

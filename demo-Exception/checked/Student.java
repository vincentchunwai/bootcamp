package checked;

import java.util.NoSuchElementException;

public class Student {
  String name;
  long pocketMoney;

  public Student() {

  }

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10)
      throw new NameTooLongException("Name is too long (>50)");

    this.name = name;

  }

  public void setPocketMoney(long pocketMoney) throws AmountZeroException{
    if (pocketMoney <= 0){
      throw new AmountZeroException("Amount <= 0");
    }
    this.pocketMoney = pocketMoney;
  }

  public static void main(String[] args) throws NameTooLongException{
    Student student = new Student("John");
     try {
      //int i = 10/ 0;
      student.setName("Peter"); // if exception,
      student.setPocketMoney(-3);
    } catch (NameTooLongException | AmountZeroException e) {
      System.out.println("Student Setter Issue, message :" + e.getMessage()); // send email to customer
    }  catch (RuntimeException e){
      System.out.println(e.getMessage());
     }  /* catch (Exception e){
      System.out.println(e.getMessage());
    } */  finally {
      System.out.println("finally");
    }
     Student student2 = new Student();
     try{student2.name.length();
     } catch (Exception e){
      System.out.println("exception");
     }
  }
}

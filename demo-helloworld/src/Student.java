public class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;


    }
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student peter = new Student("Peter", + 30);
        peter.displayInfo();
    }
}

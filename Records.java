class Student{
    String name;
    int age;
    long number;
public  void studentDetails(){
   System.out.println("My name is: " + name + ", age: " + age + ", number: " + number);
}
public void printName(){
    System.out.println(this.name);
}

Student(String name, int age, long number){
    this.name=name;
    this.age=age;
    this.number=number;
   
}
Student(Student s){
    this.name=s.name;
    // System.out.println("constructor called");
}
}
public class Records{
    
    public static void main(String args[]){
    Student student =new Student("suresh", 24, 64533);
    // student.name="surresh";
    // student.age=28; 
    // student.number=735;
    student.printName();
    student.studentDetails();
    Student student1=new Student(student);
    // student1.name="yadav";
    student1.printName();
}
}
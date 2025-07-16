package Assignment2.classwork.task2;



public class StudentTester2{
   public static void main(String [] args){
      Student s1 = new Student();
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
      s1.name = "Bob";
      s1.id = 123;
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
   }
}
// Name of the Student: Default
// ID of the Student: 0
// Name of the Student: Bob
// ID of the Student: 123

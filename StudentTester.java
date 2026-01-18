package practice;
public class StudentTester{
    public static void main(String[] args) {
        System.out.println(Student.getCounter());
        Student student1 = new Student();
        System.out.println(Student.getCounter());
        Student student2 = new Student("Sadbhav", 12);
        System.out.println(Student.getCounter());

        System.out.println(student1.getName()+ "'s id is " + student1.getId() + " and is at poistion " + student1.getLine() + " in line");
        System.out.println(student2.getName()+ "'s id is " + student2.getId() + " and is at poistion " + student2.getLine() + " in line");
        
    }

}
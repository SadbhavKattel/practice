package practice;

import java.util.*;

public class Demo{
    public static void main(String[] args) {
        List<Student> nums = new ArrayList<>();
        Student John = new Student("John", 1);
        nums.add(John);    
        Student Jane = new Student("Jane", 2);
        nums.add(Jane);
        nums.forEach(num -> System.out.println(num));
        
    }
}
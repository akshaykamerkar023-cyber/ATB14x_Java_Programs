package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args) {
        Student s1 = new Student("Akky kgf","1");
        Student s2 = new Student("Sayu","2");
        Student s3 = new Student("Aaibaba","3");

        List<Student>myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        s1.printDetails();
        s2.ptintDetails();
        s3.printDetails();


    }
}

class Student{
    private String name;
    private int rollNo;

    public Student(String name, String rollNo){
        this.rollNo= Integer.parseInt(rollNo);
        this.name=name;
    }

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;

    }
    //Public String

    public int getRollNo() {
        return rollNo;

    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public void printDetails(){
        System.out.println("Student Name: "+ this.name);
        System.out.println("Roll No: "+this.rollNo);
    }

    public void ptintDetails() {
    }
}
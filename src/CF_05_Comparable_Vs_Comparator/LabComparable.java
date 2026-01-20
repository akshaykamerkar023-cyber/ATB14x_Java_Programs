package CF_05_Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabComparable {
    public static <Employee> void main(String[] args) {
//        Employee e1 = new Employee(3,"akky");
//        Employee e2 = new Employee();
//        Employee e3 = new Employee();
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        System.out.println("Employee List:");
//        Collections.sort("employeeList");
//        System.out.println("Employee List:");


    }
    
}

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    public String PrintDetails() {
        return id + " " + name + " " + id;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}

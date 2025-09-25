package Ex_04_Operators.java;

public class Lab048_Interview {
    public static void main(String[] args) {
        int balaji_Salary = 12;
        boolean b = !(balaji_Salary > 10 || balaji_Salary < 5);
        System.out.println(b);
         // Divide and Conquer!

        //A --> Balaji_Salary > 10 --> 12 > 10 --> True
        //B--> Balaji_Salary < 5 --> 12 < 5 --> False
        // (A || B) --> True
        // !(True)--> False
    }
}

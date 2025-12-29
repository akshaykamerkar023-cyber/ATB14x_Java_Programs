package ex_27_Exceptions;

import java.util.Scanner;

public class Lab222_ThrowExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age\n");
        int age = input.nextInt();
        int user_age = 0;
        validate_age_for_club(user_age);
    }

    static void validate_age_for_club(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age can't be less than 25");

        } else if(age >= 18 && age < 25){
            System.out.println("Enjoying clubbing");
        }
    }
}

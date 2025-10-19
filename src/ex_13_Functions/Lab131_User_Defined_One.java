package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name a:");
        int a = scanner.nextInt();
        System.out.println("Enter your name b:");

        int b = scanner.nextInt();

        int result = sum_of_two_number(a,b);
        System.out.println(result);
        int result2 = sum_of_two_number(10,45);
        System.out.println(result2);

        int result3 = sum_of_two_number(333,333);
        System.out.println(result2);

    }  static int sum_of_two_number(int a,int b){
        return a+b;
    } static void non_return_type_function()
    {
        System.out.println("Enter your name a:");
    }
}

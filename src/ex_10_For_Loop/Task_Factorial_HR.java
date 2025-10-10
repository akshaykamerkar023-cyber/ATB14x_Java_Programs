package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        int n = 0;
        if (n == 0) factorial = 1;
         for (int i = n; i >=1 ; i--) {
       // for (int i = 1; i <= n ; i++) {
            factorial = factorial * 1;

        }

        System.out.println(factorial);
    }
}

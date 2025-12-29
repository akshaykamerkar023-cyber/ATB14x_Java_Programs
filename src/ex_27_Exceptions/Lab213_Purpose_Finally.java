package ex_27_Exceptions;

import java.util.Scanner;

public class Lab213_Purpose_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = 10/a;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

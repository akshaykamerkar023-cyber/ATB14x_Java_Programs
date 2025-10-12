package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for Factorial Program!");
        if (!sc.hasNextInt()) {
            System.out.println("You Full, int Only!");

        } else  {
            int number = sc.nextInt();
            int factorial = 1;
            if (number==0) {
                factorial = 1;
                System.out.println("factorial =1");
            } if (number < 0 || number > Integer.MAX_VALUE) {
                System.out.println("Can't get the factorial as out of bound!(int)");
            }  int i =1;
            while (i <= number) {
                factorial = factorial * i;
                i++;

            }
        } System.out.println("factorial");
    }
}

package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab149_Program_ChatAt_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a string, i will reverse it ");
        String user_input = scanner.nextLine();

        String reverse_user_input = "";

        for (int i = user_input.length() -1; i>= 0; i--) {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
        }
            System.out.println(reverse_user_input);
    }
}

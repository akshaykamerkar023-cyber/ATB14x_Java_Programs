package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab150_String_Palindrome {
    public static void main(String[] args) {

        String input = "Hello World";
        String reversed = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a palindrome");
        }
      //  String palindrome = "Akshay KGF";
        //System.out.println(input.equals(palindrome));

    }
}

package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 1254879630;
        //short s = phone_no; // Narrowing - Explicit

        short s = (short)phone_no;  // Narrowing - Explicit
        System.out.println(s);  // Narrowing - Explicit
    }
}

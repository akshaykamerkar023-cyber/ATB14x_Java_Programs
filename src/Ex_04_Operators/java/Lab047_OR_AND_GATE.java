package Ex_04_Operators.java;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
         //  || OR Gate
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // And && only true && true returns true

        // T || T --> T -->
        // T || F --> F
        // F || T --> F
        // F || F --> F

        System.out.println(true || true);  // True
        System.out.println(true || false);  // False
        System.out.println(false || true);  // False
        System.out.println(false || false); // False
    }
}

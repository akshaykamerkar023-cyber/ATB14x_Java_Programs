package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Akshay";
        String s1 = new String("Akshay");

        //less then <10% used
        StringBuffer stringBuffer = new StringBuffer("Akshay");
        StringBuilder stringBuilder = new StringBuilder("Akshay");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}

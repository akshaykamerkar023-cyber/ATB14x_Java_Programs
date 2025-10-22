package ex_14_String;

public class LabStringExamples1 {
    public static void main(String[] args) {
        String s = "java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "abc".compareTo("ABC");
        System.out.println(result);

        int idx = "java".indexOf("a");
        System.out.println(idx);

        int idx2 = "java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("*", "java", "Python");
        System.out.println(s11);

        String s12 = "java".replace('a', 'o' );
        System.out.println(s12);

        boolean b1 = "java".startsWith("ja");
        System.out.println(b1);

        String b2 = "java".concat("Mava");
        System.out.println(b2);

    }
}

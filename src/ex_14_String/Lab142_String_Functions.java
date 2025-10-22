package ex_14_String;

public class Lab142_String_Functions {
    public static void main(String[] args) {

        String s1 = "Hello Akky Kgf World";
        String s2 = new String("World");
        System.out.println(s1 == s2);

        String str1 = "Hello World";
        String str2 = "KGF World";
        String str3 = new String("KGF World");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str3));
    }
}

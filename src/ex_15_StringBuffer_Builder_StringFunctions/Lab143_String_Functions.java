package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Akky";

        System.out.println(name.length());
        System.out.println(name.charAt(0));

        //2. Concat()
        System.out.println(name.concat("patel"));

        //3. Contains
        System.out.println(name.contains("om"));

        //4. equals
        System.out.println(name.equals("patel"));

        //5.equalignoreCase()
        System.out.println(name.equalsIgnoreCase("Akky"));

        //indexOf
        System.out.println(name.indexOf("o"));

        String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.charAt(0));

        //7. Lenggth()
        System.out.println(name.length());

        //8. replace
        System.out.println(name.replace('n','N'));

        //substring
        System.out.println(name.substring(1,3));

        //To lower case
        System.out.println("Akky".toLowerCase());

        //To Upper case
        System.out.println("Akky".toUpperCase());

        //startwith()
        System.out.println(name.startsWith("Y"));

        //ends With
        System.out.println(name.endsWith("Y"));

        //trim
        String name3 = "  Akshay Babu  ";
        System.out.println(name3.trim());

        //Compareto
        System.out.println(name.compareTo("Akshay"));

        //-------------------------
        StringBuilder stringBuilder = new StringBuilder("Akshay");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Akshay");
        System.out.println(sb.toString());




    }
}

package ex_14_String;

import java.util.Arrays;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "java".substring(2);
        System.out.println(s);

        String s1 = "java".substring(1,3);
        System.out.println(s1);

        char[] arr = "java".toCharArray();
        System.out.println(Arrays.toString(arr));

        String st = "java".trim();
        System.out.println(st);

        boolean b = " ".isBlank();
        System.out.println(b);

        String s2 = " ab ".repeat(3);
        System.out.println(s2);

        boolean b11 = "java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

    }
}

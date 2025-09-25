package Ex_04_Operators.java;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {

        // < Less Than
        // < = --> Less Then or equal to
        // > Greater
        // > = ---> Greater then or equal to
        // == --> Equal to (But checking )
        // ! = --> Not Equal

        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age_Mamata= 43;
        int age_Pramod= 34;

        boolean result = age_Mamata >= age_Pramod;
        System.out.println(result);
        boolean result1 = age_Mamata < age_Pramod;
        System.out.println(result1);
        boolean result2 = age_Pramod <= age_Mamata;
        System.out.println(result2);
    }
}

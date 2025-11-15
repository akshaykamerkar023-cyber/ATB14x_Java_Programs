package singleinheritance;

import multilevel.Son;

public class Lab168_SI {
    public static void main(String[] args) {
        Son akky = new Son();
        System.out.println(akky.gold_f);
        akky.bhk2();
        akky.bhk3();

        Father f1 = new Father();
            System.out.println(f1.gold_f);
                f1.bhk2();

    }
}

package ex_23_OOPs_Super_Abstraction;

public class Lab190_Interview_Q {
    public static void main(String[] args) {
    }
    interface I11{}
    interface I12{}
    class A1{}
    class B1{}
    class Test3 implements I11{}
    class Test4 implements I12,I11{}
    class Test5 extends A1 implements I12,I11{}

}

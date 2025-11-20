package ex_20_OOPs_Polymorphism;

public class methodoverloadingCalculator {
    public static <Calc> void main(String[] args) {
       // Calc c1 = new Clac();
       // c1.wait((long) 3.14, (int) 3.14);
    }
}

class Calc {
    int add(int a, int b) {
        return a + b;
    }


    int sub(int a, int b, int c) {
        return a+b+c;

    }
    double add(double a, double b) {
        return a+b;
    }

    long add(long a, long b) {
        return a+b;
    }
}

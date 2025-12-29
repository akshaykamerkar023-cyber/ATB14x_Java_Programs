package ex_27_Exceptions;

public class Lab211_Multiple_Program {
    public static void main(String[] args) {
        int a = 0;
        int c=0;
        try {
            c = 10/a;
            String s1 =null;
        }  catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

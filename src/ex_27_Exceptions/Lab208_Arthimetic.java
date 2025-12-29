package ex_27_Exceptions;

public class Lab208_Arthimetic {
    public static void main(String[] args) {
        int c =10;
        int b=0;
        try{
            b=10/c;
        } catch (ArithmeticException e){
            System.out.println("Not Allow");
        }
        catch (Exception e){
            System.out.println("Hello");
        }
        catch (Throwable e){
            System.out.println("Error");
        }
    }
}

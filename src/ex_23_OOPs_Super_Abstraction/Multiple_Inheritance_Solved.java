package ex_23_OOPs_Super_Abstraction;

public class Multiple_Inheritance_Solved {
    public static void main(String[] args) {

    }
    class child1 implements father1,father2{

        public void money(){
            System.out.println("Child Money");
        }
    }
    interface father1{
        final int a = 10;
        void money();

    }
    interface father2{
        void money();

    }
}

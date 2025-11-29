package ex_23_OOPs_Super_Abstraction;

public class Lab191_Interface_Variables {
    public static void main(String[] args) {

    }
}
  interface Akky{
    final int a = 10;
    void money();

  }

  class ak implements Akky{
    int aa = 10;
    @Override
    public void money() {
        System.out.println("aa");
        System.out.println("this.aa");

    }
  }
    class akk1 implements TTA{
    @Override
    public void pratice() {

    }

    }

    interface  TTA{
        void pratice();
    }
    class rocky implements TTA{
    //@Override
    public void tech() {

    }

        @Override
        public void pratice() {

        }
    }

    interface TTA_Mentor{
    void tech();
    }

package ex_20_OOPs_Polymorphism;

public class methodoveriddingLab189_MOverriding {
    public static void main(String[] args) {

      Father f2 = new Father();
      f2.home();


    }  static class Father{
        void home(){
            System.out.println("Father home");
        }
    }
class Son extends Father{
       // @overide
    void home() {
            System.out.println("Son home");
        }
}  //Class Pramod extends void Father{
       // void home{
           // System.out.println("Son home");
        }




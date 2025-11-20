package ex_20_OOPs_Polymorphism;

import javax.sound.midi.ShortMessage;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {
        ShortMessage h1 = new ShortMessage();
       // h1.task();
       // h1.task("Bathroom");

    }
}
class Home{
    public void task(){
        System.out.println("Home");

    }
    void task(String name){
        System.out.println("Task "+name);
    }
}

package ex_17_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c23; new Cat();
        Cat c24 = null;new Cat("Lucky");
        Cat c25 = null;new Cat("Spicy");
        Cat c26 = null;new Cat("Mirchi");


        System.out.println(c24.name);
        System.out.println(c25.name);

        c25.running();
        c26.running();

    }
}

  class Cat{
    String name;

    Cat(){
        name = "Akky";

    }
    Cat (String nameParam) {
        name = nameParam;
    }

        void running(){
        int local_var = 10;
        System.out.println("Who is running -->" +this.name);
        }
  }

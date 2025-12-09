package ex_24_Static;

public class Lab193_Static_P2 {
    public static void main(String[] args) {

    }
    class ATB {

        int phone_np;
        String name;

        static String course_name = "ATB";

        static void test() {
            System.out.println("test maek");
        }

        void display() {
            System.out.println(this.phone_np + this.name + course_name);
        }
    }
}

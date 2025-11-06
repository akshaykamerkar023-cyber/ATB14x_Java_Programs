package ex_18_OOPs_Constructors;

public class Car {
    public boolean name;
    public boolean model;
    public boolean year;

    public static void main(String[] args) {
        String name;
        int year;
        String model;

        Car car = new Car(); {
            name = "Car";
            model = "Range-Rover";
            year = 2035;
            System.out.println("name: " + name);
            System.out.println("model: " + model);
            System.out.println("year: " + year);

        }
    }
}

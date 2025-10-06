package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the browser");
        String browser = scanner.next();

        switch (browser)  {
            case "chrome":
                System.out.print("Starting the chrome");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.print("TC2");
                break;
                case "firefox":
                    System.out.print("Starting the firefox");
                    System.out.println(".......");
                    System.out.println("TC1");
                    System.out.print("TC2");
                    break;
            case "edge":
                System.out.print("Starting the edge");
                System.out.println(".......");
                System.out.println("TC1");
                break;
                    default:
                        System.out.println("I have no idea which browser this is");
                        break;


        }

    }
}

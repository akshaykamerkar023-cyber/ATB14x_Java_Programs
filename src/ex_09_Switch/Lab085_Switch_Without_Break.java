package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number(1 to 7) ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                    case 3:
                        System.out.print("Wednesday");
                        case 4:
                        System.out.print("Thursday");
                        case 5:
                        System.out.print("Friday");
                        case 6:
                            System.out.print("Saturday");
                            case 7:
                            System.out.print("Sunday");
                            default:
                                System.out.print("Invalid day");
        }
    }
}

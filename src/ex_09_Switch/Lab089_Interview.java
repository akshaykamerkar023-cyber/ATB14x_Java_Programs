package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {

        char ch = 'a';
        switch (ch) {
            case 65:
                System.out.print("Match ASCII");
                break;
                default:
                    System.out.print("Invalid character");
                    break;
        }
    }
}

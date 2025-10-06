package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode) {
            case 001, 002, 003, 005:
                System.out.println(itemcode);
                break;
            case 004,006,007:
                System.out.println("This is match");
                break;

                default:
                    System.out.println(itemcode);
        }
    }
}

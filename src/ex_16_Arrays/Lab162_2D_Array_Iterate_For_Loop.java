package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] materix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i=0; i<materix.length; i++){
            for (int j=0; j<materix[i].length; j++){
                System.out.print(materix[i][j] + " | ");

            }
            System.out.println("\n");

        }
    }
}

package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] arry = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int min = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if(arry[i] < min){
                min = arry[i];
            }
        }
    }
}

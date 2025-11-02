package ex_16_Arrays;

import java.util.Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        int[] [] array_2d_old = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] predefined = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; System.out.println(Arrays.deepToString(predefined));

        int[][] array;
        array = new int[][] {{1,2}, {3,4}, {5,6}};
    }
}

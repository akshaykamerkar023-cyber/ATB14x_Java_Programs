package ex_16_Arrays;

public class Lab164_2nd_highlest_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 43, 34, 45, 67,89};
        int higest = 0;
        int secondHigest =0;

        for(int num:numbers){
            if(num > higest){
                secondHigest=higest;
                higest = num;
            }
        }
      //  else if (numbers > secondHigest && numbers != higest) {
          //  secondHigest; numbers;
        }

      //  System.out.println(secondHigest);
       // System.out.println(higest);
    }




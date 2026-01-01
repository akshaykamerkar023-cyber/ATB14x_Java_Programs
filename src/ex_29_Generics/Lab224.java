package ex_29_Generics;

public class Lab224 {

    public static void main(String[] args) {
        temp_sum_t (10,10);
        temp_sum_t(10.34,10.45);
        temp_sum_t("Akky", "Kamerkar");

    }

    static Integer temp_sum(Integer a,Integer b){
      return a+b;
   }
    static Double temp_sum(Double a,Double b){
        return a+b;
   }

    static <T> Object temp_sum_t (T t1, T t2) {
        return null;

    }
}

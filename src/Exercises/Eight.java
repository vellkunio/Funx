package Exercises;

public class Eight {

    public static void main(String[] args){
         double result = formula(1,5,7);
         System.out.print(result);
    }

    static double formula(double a, double b, double c){
        double res = (a + b) / 12 * (c%4) + b;
        return res;
    }
}

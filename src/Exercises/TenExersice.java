package Exercises;

public class TenExersice {
    public static void main(String[] args){
        double r = formula(4, 2, 1);
        System.out.print(r);
    }

    static double formula(double a, double b, double c){
        double res = Math.abs(a - b) / Math.pow(a + b,3) - Math.cos(c);
        return res;
    }
}

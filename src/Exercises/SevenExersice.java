package Exercises;

public class SevenExersice {

    public static void main(String[] args){
        double res = formula(2, 4);
        System.out.print(res);
    }

    static double formula(double a, double b){
        double res = (Math.pow(a,2) + Math.pow(b,2)) / 2;
        return res;
    }
}

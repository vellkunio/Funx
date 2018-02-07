package Exercises;

public class NineExersice {

    public static void main(String[] args){
        double r = furmula(30,4,6);
        System.out.print(r);
    }

    static double furmula(double a, double b, double c){
        double res = (a - b * c) / ((a + b) % c);
        return res;
    }
}

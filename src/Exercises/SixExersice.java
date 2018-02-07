package Exercises;

public class SixExersice {

        public static void main(String[] args){
            double res = formula(1, 2, 4);
            System.out.print(res);
        }

        static double formula(double a, double b, double c){
            double res = a + b * c / 2;
            return res;
        }

}

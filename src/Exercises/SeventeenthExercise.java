package Exercises;

import java.util.Scanner;

public class SeventeenthExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a --> ");
        double a = sc.nextDouble();
        System.out.println("Введите b --> ");
        double b = sc.nextDouble();
        System.out.println("Введите c --> ");
        double c = sc.nextDouble();
        distance(a, b, c);
    }

    static void distance(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0 && a != 0) {
            double firstX = (-b + Math.sqrt(discriminant)) / (2 * a);
            double secondX = (-b - Math.sqrt(discriminant)) / (2 * a);
            double res = Math.abs(secondX - firstX);
            System.out.println("Расстояние --> " + res);
        } else {
            System.out.println("Оупс, проблема");
        }
    }
}

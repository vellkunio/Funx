package Exercises;

import java.util.Scanner;

public class FifteenthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый радиус >");
        double firstRadius = sc.nextDouble();
        System.out.println("Введите второй радиус >");
        double secondRadius = sc.nextDouble();
        System.out.println("Введите x первой окружности >");
        double xFirst = sc.nextDouble();
        System.out.println("Введите x второй окружности >");
        double xSecond = sc.nextDouble();
        System.out.println("Введите y первой окружности >");
        double yFirst = sc.nextDouble();
        System.out.println("Введите y второй окружности >");
        double ySecond = sc.nextDouble();
        if (result(firstRadius, secondRadius, xFirst, xSecond, yFirst, ySecond)) {
            System.out.println("Дроны не столкнутся");
        } else {
            System.out.println("Дроны столкнутся");
        }
    }


    static boolean result(double firstRadius, double secondRadius, double xFirst, double xSecond, double yFirst, double ySecond) {
        double res = firstRadius + secondRadius;
        double dlina = Math.sqrt(Math.pow(xSecond - xFirst, 2) + Math.pow(ySecond - yFirst, 2));
        if (dlina > res || dlina + firstRadius < secondRadius || dlina + secondRadius < firstRadius) {
            return true;
        } else {
            return false;
        }
    }
}
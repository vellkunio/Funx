package Exercises;

import java.util.Scanner;

public class FourteenExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число >>>   ");
        int x = sc.nextInt();
        if (Number(x) == true) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    static boolean Number(int a) {
        boolean res = a % 2 == 0;
        return res;
    }
}









/* Scanner sc = new Scanner(System.in);
        System.out.print("Введите число >>>> ");
        int x = sc.nextInt();
       // double res = x / 2;
        if (x % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        } */

  /*  static int Number(int x){
        double res = x / 2;
        if(res % 1 == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    } */

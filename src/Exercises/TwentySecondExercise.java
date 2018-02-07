package Exercises;

import java.util.Scanner;

public class TwentySecondExercise {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int x = RandomNumber();
        //System.out.println("Задуманное системой число: " + x);
        comparison(x );
    }

    static int RandomNumber() {
        int number = (int) (1 + Math.random()*10000);
        return number;
        //Рандомное число 1-10
    }

    static void comparison(int x) {
        boolean n = false;
        Scanner number = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int a = number.nextInt();
         while (n == false) {
             if (a >= 1 && a <= 10000) {
                 if (x == a) {
                     System.out.println("Угадал");
                     n = true;
                     break;
                 } else if (x > a) {
                     n = false;
                     System.out.println("Введи больше");
                     a = number.nextInt();
                 } else if (x < a) {
                     n = false;
                     System.out.println("Введи меньше");
                     a = number.nextInt();
                 }
                 }  else {
                 System.out.println("Число вне диапазона");
                 a = number.nextInt();
                 n = false;
             }
         }
    }
}


   /* static boolean comparison(int[] array, int a){
        if(array[0] == a){
            return true;
        } else {return false;}
    } */



/*static boolean RandomNumber(int a) {
        int N = 1;
        int[] array = new int[N];
        array[0] = (int) (1 + (Math.random()*10));
        System.out.println("Система: " + array[0]);
        //Создает массив из 1 числа от 1 до 10
        if(array[0] == a){
            return true;
        } else {return false;}
    } */

/*if(RandomNumber(a)){
            System.out.println("Угадал");
        } else {
            System.out.println("Лох");
        } */
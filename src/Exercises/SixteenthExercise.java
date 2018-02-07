package Exercises;

import java.util.Scanner;

public class SixteenthExercise {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость первого поезда > ");
        double firstVelocity = sc.nextDouble();
        System.out.println("Введите скорость второго поезда > ");
        double secondVelocity = sc.nextDouble();
        if(boom(firstVelocity, secondVelocity)){
            System.out.println("Всё хорошо");
        } else{
            System.out.println("DANGER!!");
        }
    }

    static boolean boom(double firstVelocity, double secondVelocity) {
        double distanceFirstTrain = 4;
        double distanceSecondTrain = 6;
        double firstTimeTrain = distanceFirstTrain / firstVelocity;
        double secondTimeTrain = distanceSecondTrain / secondVelocity;
        if (firstTimeTrain < secondTimeTrain) {
            return true;
        } else {
            return false;
        }
    }
 }


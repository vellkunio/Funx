package Exercises;

import java.util.Scanner;

public class EighteenthExercise {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введети имя и фамилию: ");
        String str = sc.nextLine();
        sum(str);
    }

    static void sum(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum = sum + str.charAt(i);
        }
        System.out.println(sum);
    }
}

package Exercises;

public class twentyFourthExercise {

    public static void main(String[] args){
        basketball();

    }

    private static void basketball(){

        int[] squad = {8,6,9,14,16,6,8,9,10,5};
        int maxOsnova = 0;
        int maxZapas = 0;
        for(int i = 0; i <= 8; i+=2){
            maxOsnova += squad[i];
        }

        for(int i = 1; i <= 9; i+=2){
            maxZapas += squad[i];
        }

        int total = maxOsnova - maxZapas;
        System.out.println("Основная команда закинула на " + total + " очков больше :)");

    }

}

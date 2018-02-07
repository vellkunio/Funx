package Exercises;

public class TwentyThirdExercise {

    public static void main(String[] args){

        murderKennedy();


    }

    private static void murderKennedy(){

        int max = 0;
        int maxNumber = 0;
        int n = 10;
        int[] array = new int[n]; //Создан массив 10 подозреваемых (0-9)
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100 + 1); //Выданы шансы на убийство

            if(array[i] >= maxNumber){
                maxNumber = array[i];
                max = i;
            } //Максимальные шансы на данный момент у i чувака
        } //Найден убийца
        System.out.println("(Среди убийц с номерами 0-9)>> Убийца подозреваемый номер: " + max);
    }

}

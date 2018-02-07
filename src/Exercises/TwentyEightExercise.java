package Exercises;

public class TwentyEightExercise {

    public static void main (String[] args) {
        array();



    }

    public static void array() {
        int vampirs = 0;
        int oboroten = 0;
        int man = 0;
        int woman = 0;

        int N = 103;
        int[] array = new int[N]; //Создан массив 103 эл.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 4); //Массив из цифр 1-4
            if (array[i] == 1) {
                vampirs += 1;
            } else if (array[i] == 2) {
                oboroten += 1;
            } else if (array[i] == 3) {
                man += 1;
            } else if (array[i] == 4) {
                woman += 1;
            }
        }

       /* for (int i = 0; i <= array.length; i++) {
            if (array[i] == 1) {
                vampirs += 1;
            } else if (array[i] == 2) {
                oboroten += 1;
            } else if (array[i] == 3) {
                man += 1;
            } else if (array[i] == 4) {
                woman += 1;
            }
        } // Посчитано сколько кого */

        int topWorker = 0;
        int max = vampirs;
        int[] animal = {vampirs, oboroten, man, woman};
            for(int i = 0; i <= animal.length - 1; i++){
                if(animal[i] > max){
                    max = animal[i];
                    topWorker = i; //Номер 0-3 чувака, которых больше всего
                }
            } //Нахождение максимального
        if(topWorker == 0){
            System.out.println("Больше всего работает Вампиров");
        } else if(topWorker == 1){
            System.out.println("Больше всего работает Оборотней");
        } else if (topWorker == 2){
            System.out.println("Больше всего работает Мужчин");
        } else{
            System.out.println("Больше всего работает Женщин");
        }

    }

}

 /* char max = 'v';

            char[] animal = {'v','o','m','w'};
            for (int i = 0; i <= animal.length - 1; i++) {
                if (animal[i] < animal[i + 1]) {
                    max = animal[i];

            }
        } */

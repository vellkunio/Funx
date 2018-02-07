package Exercises;

public class TwentyOneExercise {

    public static void main(String[] args){
        secretNumber();



    }

    private static void secretNumber(){

        long x = (long) (Math.random() * 10000000000000L + 10000000000000L);
        System.out.println(x);

        int max = 0; //Максимальная цифра из числа
        long j = 10; //Вспомогательное число для нахождения цифры
        long a; //Проверяемая цифра

        for(int n = 0; n <= 14; n++){
            a = x % j;
            if(a >= max){
                max = (int)a;
            }
            x/=j;
        }
        System.out.println("Заработано Ботнариума: " + max);

    }


}

package Exercises;

public class twentyFifthExercise {

    public static void main(String[] args){
        rugby();



    }


    private static void rugby(){
        int n = 25;
        int[] firstSquad = new int[n];
        int[] secondSquad = new int[n];
        double averageFirst = 0;
        double averageSecond = 0;
        double sum = 0;


        for(int i = 0; i < firstSquad.length; i++){
            firstSquad[i] = (int)(Math.random() * 40 + 18);
            System.out.print(firstSquad[i] + ", ");
            sum += firstSquad[i];
        }
        averageFirst = sum / n;
        sum = 0;



        System.out.println();
        System.out.println(averageFirst);



        for(int i = 0; i < secondSquad.length; i++){
            secondSquad[i] = (int)(Math.random() * 40 + 18);
            System.out.print(secondSquad[i] + ", ");
            sum += secondSquad[i];
        }
        averageSecond = sum / n;
        System.out.println();
        System.out.println(averageSecond);
        System.out.println();



        if(averageFirst == averageSecond){
            System.out.println("Ого, их средние возраста равны");
        } else if(averageFirst > averageSecond){
            System.out.println("Средний возраст первой команды больше");
        } else {
            System.out.println("Средний возраст второй команды больше");
        }

    }


}

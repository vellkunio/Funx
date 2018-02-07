package Exercises;

public class TwentiethExercise {
    public static void main(String[] args){
shuttles();
    }

static void shuttles(){
        int shuttle = 0, number = 0;
        while(shuttle <=100){
            number++;
            if(!(number / 10 == 4 || number % 10 == 4 || number == 9 || number / 10 == 9)){
                shuttle++;
                System.out.print(number + ", ");
            }
        }
    }
}

//Пытался ещё с if(numbers != 4 || numbers / 10 != 4 || numbers % 10 != 4 || numbers != 9 || numbers / 10 != 9 || numbers % 10 != 9)
// if (!(numbers == 4 || numbers / 10 == 4 || numbers % 10 == 4 || numbers == 9 || numbers / 10 == 9 || numbers % 10 == 9))
//if(numbers != 4 && numbers / 10 != 4 && numbers % 10 != 4 && numbers != 9 && numbers / 10 != 9 && numbers % 10 != 9)

/*          int number = 0;
            for(int shuttles = 1; shuttles <= 100; shuttles ++){
            number += 1;
            if(number / 10 == 4 || number % 10 == 4 || number == 9 || number / 10 == 9){
                number ++;
            }
            System.out.print(number + ",");
        } */
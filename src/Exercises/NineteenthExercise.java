package Exercises;

public class NineteenthExercise {
    public static void main(String[] args) {
     SalaryDays();
    }

    static void SalaryDays(){
        int days = 1;
        int sum = 0;
        for(int money = 1; money <1000000; money *= 3){
            sum = sum + money;
            if(sum >= 1000000){
                break;
            }
            days++;
        }
        System.out.println(days);
    }

}

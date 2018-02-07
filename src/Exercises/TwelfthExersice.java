package Exercises;

public class TwelfthExersice {
    public static void main(String[] args){
        int AllPassedDays = passedDays(10,9, 2000);
        System.out.println(AllPassedDays + " days left");
    }

    static int passedDays(int days, int monhts, int years){
        int DaysInYear = 420, DaysInMonth = 42;
        int allDays = (years * DaysInYear - DaysInYear) + (monhts * DaysInMonth - DaysInMonth) + (days - 1);
        return allDays;
    }
}

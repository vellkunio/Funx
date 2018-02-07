package Exercises;

public class ThirteenExersice {
    public static void main(String[] args){
        int AllSteps = steps(427);
        System.out.println(AllSteps);
    }


    static int steps(int x){
        int First = x / 100;
        int Second = x / 10 % 10;
        int Third = x % 10;
        int res = First + Second + Third;
          return res;
    }


//    static int firstTourist(int x){
//        int First = x / 100;
//        return x;
//    }

//    static int secondTourist(int x) {
//        int Second = x / 10 % 10;
//        return x;
//    }

//    static int ThirdTourist(int x) {
//        int Third = x % 10;
//        return x;

//    }
}

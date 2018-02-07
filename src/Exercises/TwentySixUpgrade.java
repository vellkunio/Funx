package Exercises;

public class TwentySixUpgrade {

    public static void main(String[] args){
        int N = 61;
        /*int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }*/

        for(int i = 1; i<N; i++){
            if(isPrimaryNumber(i)){
                System.out.print(i + ", ");
            }
        }


    }

    private static boolean isPrimaryNumber(int n){
        for(int i = 2; i < n-1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;


    }

}

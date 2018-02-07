package Exercises;

public class twentySeventhExercise {

    public static void main(String[] args){

        password();

    }


    private static void password(){

        int n = 50;
        int k;
        int[] pass = new int[n];
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        } //Массив с числами 1 - 50

        for(int j = 0; j < pass.length; j++){
             k = (int)(Math.random() * n); // k - номер элемента который выпал (надо удалить)

             pass[j] = array[k];
             System.out.print(pass[j] + ", ");

             for(int i = 0, x = n - k - 1; i < x; i++, k++){
                 array[k] = array[k+1];
             }

                 n -= 1;

        }
    }
}


/*for(int x = 0; x < array.length; x++){
                 if(array[x] == 0){

                 }
             }*/


 /*arr[0] = (int)(Math.random() * 50 + 1);
for(int j = 1; j <= arr.length; j++){
         arr[j] = (int)(Math.random() * 50 + 1);

            for(int i = 0; i < j; i++){
                if(arr[j] == arr[i]){
                    while(arr[j] == arr[i]){
                        arr[j]
                    }
                }
            }

            for(int x = 0; x < array.length - k; x++, j++){ //x = номер элемента который надо убрать
                array[j] = array[j+1];
             }




        }*/
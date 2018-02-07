package Exercises;

import java.util.Scanner;

public class twentyNine {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text >>> ");
        String str = sc.nextLine(); //Ввод строки
        //String str = "mother";
        kodirovka(str);

    }

    private static void kodirovka(String str){
        char[] kod = {'q','w','e','r',' ','t','y','u','i','o','!','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'}; // код шифрования

        char[] strArr = str.toCharArray(); //перевод строки в символы
        String newStr = ""; // создание новой строки
        int newIndex = 0;
        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < kod.length; j++){
                if(strArr[i] == kod[j]) {
                    newIndex = j + 5;
                    break;
                    }
                }
                if(newIndex >= kod.length){
                newIndex -= kod.length;
            }
            String x = String.valueOf(kod[newIndex]);
            newStr += x;
        }
        System.out.println(newStr);
    }
}




//if(kod[j+5] < kod.length){
//String x = String.valueOf(kod[j+5]);
// newStr += x;
//} else {
//int a = 5 - (kod.length - j);
//String x = String.valueOf(kod[a]);
//newStr += x;
//int a = kod.length - kod[j];
//String x = String.valueOf(kod[a]);
//newStr += x;

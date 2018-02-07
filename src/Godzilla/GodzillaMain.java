package Godzilla;

import Godz.Godzilla;

import java.util.Scanner;

public class GodzillaMain {

    public static void main(String[] args){

        Godzillka godz = new Godzillka(90); // Конструктор
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        while(x == false){
            System.out.print("Введи еду:");
            int eat = sc.nextInt();
            x = godz.eating(eat);
        }



    }


}

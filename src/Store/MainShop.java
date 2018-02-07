package Store;

import java.util.Scanner;

public class MainShop {
    public static void main(String[] args){

        product cucumber = new product("cucumber",20,100,5);
        product tomato = new product("tomato", 30,500, 8);
        product banana = new product("banana", 50, 80, 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько купили огурцов: ");
        int x = sc.nextInt();
        System.out.println("Осталось огурцов: " + cucumber.LeftInShop(x));
        System.out.println("Прибыль по огурцам: " + cucumber.GetProfit());

        System.out.println("Сколько купили помидор: ");
        x = sc.nextInt();
        System.out.println("Осталось помидор: " + tomato.LeftInShop(x));
        System.out.println("Прибыль по помидорам: " + tomato.GetProfit());

        System.out.println("Сколько купили бананов: ");
        x = sc.nextInt();
        System.out.println("Осталось бананов: " + banana.LeftInShop(x));
        System.out.println("Прибыль по бананам: " + banana.GetProfit());
    }
}

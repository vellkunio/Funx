package Store;

public class product {
    private String name;
    private int price;
    private int quantity;
    /*
    /costPrice - Себестоимость
     */
    private int costPrice;
    private int bought; // Сколько куплено

    public product(String name, int price, int quantity, int costPrice) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.costPrice = costPrice;
    }

    public int LeftInShop(int bought){
        this.bought = bought;
        int x = quantity - bought;
        return x;
    }

    public int GetProfit(){
        int profit = bought * price - costPrice * bought;
        return profit;
    }
}

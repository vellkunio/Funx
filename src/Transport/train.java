package Transport;

public class train extends vehicle {
    private int wagons;

    public train(String number, int maxSpeed, int price, int wagons) {
        super(number, maxSpeed, price);
        this.wagons = wagons;
    }

    public void cost(){
        int x = wagons * price;
        System.out.println("Выгода с вагона: " + x);
    }
}

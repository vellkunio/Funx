package Transport;

public class plane extends vehicle {
    private int seat;

    public plane(String number, int maxSpeed, int price, int seat) {
        super(number, maxSpeed, price);
        this.seat = seat;
    }

    public void cost(){
        int x = seat * price;
        System.out.println("Выгода с рейса: " + x);
    }
}

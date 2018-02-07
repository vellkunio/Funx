package Transport;

public class vehicle {
    private String number;
    private int maxSpeed;
    protected int price;

    public vehicle(String number, int maxSpeed, int price) {
        this.number = number;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void prize(){
        this.price = price * 2;
    }


}

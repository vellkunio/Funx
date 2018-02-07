package Transport;

public class MainTransport {
    public static void main(String[] args){
        train tr1 = new train("ВН1111УК", 200, 25000, 15);
        plane pl1 = new plane("ВН1234АП", 800, 200000, 100);
        tr1.prize();
        tr1.cost();
        pl1.cost();
    }
}

package Okrujnost;

public class MainClass {

    public static void main(String[] args){
        Circle circle = new Circle(5,0,1);
        Point point = new Point(1,2);
        int pointX = point.getPointX();
        int pointY = point.getPointY();
        if(circle.check(pointX, pointY)){
            System.out.println("Точка в окружности");
        } else {
            System.out.println("Точка не в окружности");
        }
    }
}

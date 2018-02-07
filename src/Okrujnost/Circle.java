package Okrujnost;

public class Circle {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(int radius, int centerX, int centerY){
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }



    public boolean check(int pointX, int pointY){
        double d = Math.sqrt(Math.pow(centerX - pointX, 2) + Math.pow(centerY - pointY, 2));
        if(radius > d){
            //System.out.println("Точка в окружности");
            return true;
        } else {
            //System.out.println("Точка не в окружности");
            return false;
        }
    }
}

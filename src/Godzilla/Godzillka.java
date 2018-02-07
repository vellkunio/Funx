package Godzilla;

public class Godzillka {
    private int amountStomach;


    public Godzillka(int amountStomach) {
        this.amountStomach = amountStomach;
    }

    public boolean eating(int eat){
        if(amountStomach - eat < 0){
            System.out.println("Я не могу столько скушать");
        } else{
            amountStomach -= eat;
            if(amountStomach == 0){
                System.out.println("Спасибо, я наелся");
                return true;
            }
        }
        return false;
    }
}


/*public void eating(int eat){
        if(amountStomach - eat > 0){
            amountStomach += eat;
        } else{
            System.out.println("Я не могу столько скушать");
        }*/
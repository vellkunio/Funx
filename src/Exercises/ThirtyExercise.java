package Exercises;

public class ThirtyExercise {

    public static void main(String[] args) {
               password();
    }

    private static void password() {
        String pass = "";

        char c = (char) (Math.random() * 25 + 97); //2
        pass += c;
        c = (char) (Math.random() * 25 + 65); //2
        pass += c;
        c = (char) (Math.random() * 25 + 97); //3
        pass += c;
        c = (char) (Math.random() * 25 + 65); //4
        pass += c;
        c = '_'; //5
        pass += c;
        c = (char) (Math.random() * 25 + 65); //6
        pass += c;
        c = (char) (Math.random() * 9 + 48); //7
        pass += c;
        c = (char) (Math.random() * 9 + 48); //8
        pass += c;

        System.out.println(pass);
    }

}

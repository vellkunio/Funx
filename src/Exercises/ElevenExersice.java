package Exercises;

public class ElevenExersice {
    public static void main(String[] args){
        double USDinGrn = USDinGRN(100, 26.74);
        System.out.println(USDinGrn + " grn");
        double GRNinUSD = GRNinUSD(5000, 26.53);
        System.out.println(GRNinUSD + " usd");
    }

    static double USDinGRN(double USD, double rate){
        double r = USD * rate;
        return r;
    }

    static double GRNinUSD(double GRN, double rate){
        double r = GRN / rate;
        return r;
    }


//      static double DollinGrn(double Doll){
//        double r = Doll / 26.74;
//        return r;
//    }

//    static double GrnInDoll(double Grn){
//        double r = Grn * 26.53;
//        return r;
//    }
}

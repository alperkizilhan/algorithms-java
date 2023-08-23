package Odevler;

public class CemberDaire {
    double yariCap;
    public CemberDaire(double yaricap){
        this.yariCap=yaricap;
    }

    public double cevreHesapla(){
        double cevre= 2*yariCap*3.14;
        return cevre;
    }

    public double alanHesapla(){
        double alan= 3.14*(yariCap*yariCap);
        return alan;
    }
}

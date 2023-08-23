package Odevler;

public class Ogrenci {
    private int ogrenciID;
    private int not;

    public Ogrenci(int ogrenciID, int not){
        this.ogrenciID=ogrenciID;
        this.not=not;
    }

    public int getOgrenciID() {
        return ogrenciID;
    }

    public void setOgrenciID(int ogrenciID) {
        this.ogrenciID = ogrenciID;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }


    public void ogrenciBilgileriniYazdir(){
        System.out.println("id :"+ogrenciID + " not:"+not);
    }
}

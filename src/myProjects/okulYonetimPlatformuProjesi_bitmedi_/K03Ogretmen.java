package myProjects.okulYonetimPlatformuProjesi_bitmedi_;

public class K03Ogretmen extends K01Kisi {
    /*
    Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
     */

    private String brans ;
    private int sicilNo=5200;
    public int getSicilNo() {return sicilNo;}
    public void setSicilNo(int sicilNo) {this.sicilNo = sicilNo;}



    public String getBrans() {return brans;}
    public void setBrans(String brans) {this.brans = brans;}



    public K03Ogretmen() {  }

    public K03Ogretmen(String ad, String soyAd, String tc, int yas, String brans, int sicilNo) {
        super(ad, soyAd, tc, yas);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return  "Brans= " + brans +
                ", SicilNo= " + sicilNo ;

    }
}

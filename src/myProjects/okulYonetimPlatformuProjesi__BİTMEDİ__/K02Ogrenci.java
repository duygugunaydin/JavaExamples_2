package miniProjeler.okulYonetimPlatformuProjesi__BİTMEDİ__;

public class K02Ogrenci extends K01Kisi {


    private int okulNo=1000;
    private int sinif ;

    public int getOkulNo() {return okulNo;}
    public void setOkulNo(int okulNo) {this.okulNo = okulNo;}


    public int getSinif() {return sinif;  }
    public void setSinif(int sinif) {this.sinif = sinif;}


    public K02Ogrenci(){  /*bos constructor */  }

    public K02Ogrenci(String ad, String soyAd, String tc, int yas, int okulNo, int sinif) {
        super(ad, soyAd, tc, yas);
        this.okulNo = okulNo;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return  "Okul No=" + okulNo +
                ", Sinif=" + sinif ;
    }
}

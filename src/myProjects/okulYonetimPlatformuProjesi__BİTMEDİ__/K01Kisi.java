package miniProjeler.okulYonetimPlatformuProjesi__BİTMEDİ__;

public class K01Kisi {

    protected String ad ;
    protected String soyAd ;
    protected String tc;
    protected int yas ;

    K01Kisi(){  /* bos constructor */  }

    public K01Kisi(String ad, String soyAd, String tc, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.tc = tc;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return  "ad=" + ad +
                ", soyAd=" + soyAd +
                ", tc=" + tc +
                ", yas=" + yas ;
    }

    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}


    public String getSoyAd() {return soyAd;}
    public void setSoyAd(String soyAd) {this.soyAd = soyAd;}


    public String getTc() {return tc;}
    public void setTc(String tc) {this.tc = tc;}


    public int getYas() {return yas;}
    public void setYas(int yas) {this.yas = yas;}
}


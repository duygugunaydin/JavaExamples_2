package myProjects.ogrenciYonetimPlatformuProjesi_bitmedi_;

public class Ogrenci {

    /*
         BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
	-AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF  BİLGİLERİNİ İÇERMELİDİR.
     */

    private String ad ;
    private String soyAd ;
    private String tc ;
    private int yas;
    private int okulNo ;
    private int sinif ;

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyAd() {
        return soyAd;
    }
    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }
    public String getTc() {
        return tc;
    }
    public void setTc(String tc) {
        this.tc = tc;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
    public int getOkulNo() {
        return okulNo;
    }
    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public int getSinif() {
        return sinif;
    }
    public void setSinif(int sinif) {
        this.sinif = sinif;
    }


    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyAd, String tc, int yas, int okulNo, int sinif) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.tc = tc;
        this.yas = yas;
        this.okulNo = okulNo;
        this.sinif = sinif;
    }
    @Override
    public String toString() {
        return  "İsim= " + ad +
                ", Soyisim=" + soyAd +
                ", TC No=" + tc +
                ", Yas=" + yas +
                ", Okul No=" + okulNo +
                ", Sinif=" + sinif;
    }
}

package miniProjeler.kitaplik;

import java.util.ArrayList;
import java.util.List;

public class Kitap {

    private int kitapNo ;
    private String kitapAdi;
    private String yazarAdi;
    private double fiyati;
    static List<Kitap> kitapList = new ArrayList<>();

    public Kitap() {

    }
    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, double fiyati) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyati = fiyati;
    }
    @Override
    public String toString() {
        return  "kitapNo=" + kitapNo +
                ", kitapAdi=" + kitapAdi +
                ", yazarAdi=" + yazarAdi +
                ", fiyati=" + fiyati ;
    }

    public int getKitapNo() {
        return kitapNo;
    }
    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }


    public String getKitapAdi() {
        return kitapAdi;
    }
    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }



    public String getYazarAdi() {
        return yazarAdi;
    }
    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }



    public double getFiyati() {
        return fiyati;
    }
    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }
}

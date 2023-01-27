package laptp;

import java.util.ArrayList;
import java.util.List;

public class Calculation {

    int lapTopNo;
    String secilenMarkaAdi="";
    String secilenCPUAdi="";
    String secilenSizeAdi="";
    String secilenRamAdi="";
    String secilenRenkAdi="";

    static int secilenCPUFiyat=0;
    static int secilenSizeFiyat=0;
    static int secilenRamFiyat=0;
    static int secilenRenkFiyat=0;
    int bilgFiyat = secilenCPUFiyat+secilenSizeFiyat+secilenRamFiyat+secilenRenkFiyat;
    int toplamFiyat ;

    static List<Calculation> bilgList=new ArrayList<>();

    public Calculation() {
    }


    public Calculation(int lapTopNo, String secilenMarkaAdi, String secilenCPUAdi,
                       String secilenSizeAdi, String secilenRamAdi, String secilenRenkAdi) {
        this.lapTopNo = lapTopNo;
        this.secilenMarkaAdi = secilenMarkaAdi;
        this.secilenCPUAdi = secilenCPUAdi;
        this.secilenSizeAdi = secilenSizeAdi;
        this.secilenRamAdi = secilenRamAdi;
        this.secilenRenkAdi = secilenRenkAdi;
    }

    @Override
    public String toString() {
        return "Calculation{" +

                "lapTopNo='" + lapTopNo + '\'' +
                "secilenMarkaAdi='" + secilenMarkaAdi + '\'' +
                ", secilenCPUAdi='" + secilenCPUAdi + '\'' +
                ", secilenSizeAdi='" + secilenSizeAdi + '\'' +
                ", secilenRamAdi='" + secilenRamAdi + '\'' +
                ", secilenRenkAdi='" + secilenRenkAdi + '\'' +
                ", Bilgisayar Fiyati ='" +bilgFiyat + '\'' +
                '}';
    }
}

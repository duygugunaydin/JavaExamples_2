package EkipLaptopProjesi;

import java.util.Scanner;

public class Methodlar extends Calculation {

    static Scanner scan=new Scanner(System.in);
    static int lapTopNumarasi=100;

    public void getRam() {

        System.out.println("Rami seciniz:\n" +
                "1- 32 gb, fiyati 300\n"+
                "2- 16 gb, fiyati 200\n"+
                "3- 8 gb, fiyati 100\n"+
                "4- 4 gb, fiyati 50\n");
        String secimRam= scan.nextLine();

        switch(secimRam){
            case "1": secilenRamAdi="32 gb";
                secilenRamFiyat=300;
                break;
            case "2":  secilenRamAdi="16 gb";
                secilenRamFiyat=200;
                break;
            case "3":  secilenRamAdi="8 gb";
                secilenRamFiyat=100;
                break;
            case "4":  secilenRamAdi="4 gb";
                secilenRamFiyat=50;
                break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getRam();

        }
    }

    public void getCPU() {

        System.out.println("CPU seciniz:\n" +
                "1- i3, fiyati 200\n"+
                "2- i5, fiyati 300\n"+
                "3- i7, fiyati 500\n");

        String secimCPU= scan.nextLine();

        switch(secimCPU){
            case "1": secilenCPUAdi="i3";
                secilenCPUFiyat=200;
                break;
            case "2":  secilenCPUAdi="i5";
                secilenCPUFiyat=200;
                break;
            case "3":  secilenCPUAdi="i7";
                secilenCPUFiyat=100;
                break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getCPU();

        }
    }

    public void getSize() {

        System.out.println("Size seciniz:\n" +
                "1- Mini, fiyati 100\n"+
                "2- Middle, fiyati 200\n"+
                "3- Max, fiyati 300\n");

        String secimSize= scan.nextLine();

        switch(secimSize){
            case "1": secilenSizeAdi="Mini";
                secilenSizeFiyat=100;
                break;
            case "2":  secilenSizeAdi="Middle";
                secilenSizeFiyat=200;
                break;
            case "3":  secilenSizeAdi="Max";
                secilenSizeFiyat=300;
                break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getSize();

        }
    }

    public void getRenk() {

        System.out.println("Renk seciniz:\n" +
                "1- Red, fiyati 400\n"+
                "2- Orange, fiyati 300\n"+
                "3- Silver, fiyati 200\n"+
                "4- Black, fiyati 150\n");

        String secimRenk= scan.nextLine();

        switch(secimRenk){
            case "1": secilenRenkAdi="Red";
                secilenRenkFiyat=400;
                break;
            case "2":  secilenRenkAdi="Orange";
                secilenRenkFiyat=300;
                break;
            case "3":  secilenRenkAdi="Silver";
                secilenRenkFiyat=200;
                break;
            case "4":  secilenRenkAdi="Black";
                secilenRenkFiyat=150;
                break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getRenk();

        }
    }

    public void getMarka() {

        System.out.println("Marka seciniz:\n" +
                "1- Asus\n"+
                "2- HP\n"+
                "3- Casper\n"+
                "4- LG\n");

        String secimMarka= scan.nextLine();

        switch(secimMarka){
            case "1": secilenMarkaAdi= "Asus"; break;
            case "2": secilenMarkaAdi=  "HP"; break;
            case "3": secilenMarkaAdi=  "Casper"; break;
            case "4": secilenMarkaAdi=  "LG"; break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getMarka();

        }
    }
    public void menu(){

        System.out.println("\n\n");
        System.out.println("===== WQ TECH MARKET =====");
        System.out.println("Almak istediginiz urunun ozellikleri icin ; ");
        getMarka();
        getCPU();
        getRam();
        getSize();
        getRenk();
        bilgFiyat = secilenCPUFiyat+secilenSizeFiyat+secilenRamFiyat+secilenRenkFiyat;

        Calculation calculation=new Calculation(++lapTopNumarasi,secilenMarkaAdi,
                                                   secilenCPUAdi,secilenSizeAdi,
                                                   secilenRamAdi,secilenRenkAdi);
        bilgList.add(calculation);
        for (Calculation each:bilgList
        ) {
            System.out.println(each);
        }

        toplamFiyat += bilgFiyat;


        System.out.println("Alisverise devam etmek ister misiniz: E/H");
        String secim= scan.nextLine();

        if(secim.equalsIgnoreCase("e")){
            menu();
        }else {
            System.out.println("Odeme sayfasina yonlendiriliyorsunuz ...");
            System.out.println("Lutfen odemeyi yapiniz\n" + "Toplam odeme: "+ toplamFiyat);
        }

    }
}

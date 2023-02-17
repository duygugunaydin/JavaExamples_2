package miniProjeler.ogrenciYonetimPlatformuProjesi__BİTMEDİ__;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metholar {

    static Scanner scan = new Scanner(System.in);
    static int okulNo = 1234;
    static List<Ogrenci> ogrList = new ArrayList<>();

    static int secim;

    public void menu() {

        String kontrol;

        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("ÖĞRENCİ YÖNETİM PLATFORMUNA HOSGELDİNİZ");
        System.out.println("============== İŞLEMLER ==============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n");

        do {
            System.out.print("\tSEÇİMİNİZ : ");
            try {
                secim = scan.nextInt();
            } catch (Exception e) {
                kontrol = scan.next();
                if (kontrol.equalsIgnoreCase("q")) {
                    System.out.println("**********  Sistemden Cikildi  *************");
                    System.exit(0);
                } else
                    secim = 5;
            }
            switch (secim) {
                case 1:
                    ogrenciEklemeMethodu();
                    break;
                case 2:
                    System.out.print("Aramak istediginiz ogrencinin TC numarasini giriniz : ");
                    ogrenciAramaMethodu(scan.next());
                    break;
                case 3:
                    ogrenciListelemeMethodu();
                    listelemeKontrolMethodu();
                    break;
                case 4:
                    ogrenciListelemeMethodu();
                    System.out.print("Silmek istediginiz ogrencinin TC numarasini giriniz : ");
                    ogrenciSilmeMethodu(scan.next());
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz : ");
            }
        } while (!(1 <= secim && secim <= 4));
    }

    public void ogrenciEklemeMethodu() {

        System.out.print("Lutfen ogrencinin adini giriniz : ");
        scan.next();
        String ad = scan.nextLine();
        System.out.print("Lutfen ogrencinin soyadini giriniz : ");
        String soyAd = scan.nextLine();
        System.out.print("Lutfen ogrencinin TC no'sunu giriniz : ");
        String tc = tcNoKontrol(scan.next());
        System.out.print("Lutfen ogrencinin yasini giriniz : ");
        int yas = scan.nextInt();
        System.out.println("Lutfen ogrencinin okul numarasi : " + ++okulNo);
        System.out.print("Lutfen ogrencinin sinifini giriniz : ");
        int sinif = scan.nextInt();

        Ogrenci ogrenci = new Ogrenci(ad, soyAd, tc, yas, okulNo, sinif);
        ogrList.add(ogrenci);
        System.out.println("Kayit basarili\n\n");


        do {
            System.out.println("Baska ogrenci kaydi icin  >> 1 " +
                             "\nAna menuye donmek icin    >> 2 " +
                             "\nCikis yapmak icin         >> 3 'e basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    ogrenciEklemeMethodu();
                } else if (secim == 2)
                    menu();
                else if (secim == 3)
                    System.exit(0);
                else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim = 5;
                scan.next();
            }
        } while (!(1 <= secim && secim <= 3));

    }

    public void ogrenciAramaMethodu(String tcNo) {

        boolean kontrol = true;
        if (ogrList.isEmpty()) System.out.println("Listede kayitlı ogrenci yok.");
        else {
            for (int i = 0; i < ogrList.size(); i++) {
                if (ogrList.get(i).getTc().equalsIgnoreCase(tcNo)) {
                    System.out.println("Ogrenci bilgileri : \n" + ogrList.get(i) + "\n\n");
                    break;
                } else {
                    kontrol = false;
                }
            }
            if (!kontrol) System.out.println("Aradiginiz TC no'ya ait ogrenci bilgisi bulunamadi\n\n");
        }
        do {
            System.out.println("Baska ogrenci aramak icin  >> 1 " +
                    "\nAna menuye donmek icin     >> 2 " +
                    "\nCikis yapmak icin          >> 3 'e basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    System.out.println("Aramak istediginiz ogrencinin TC numarasini giriniz : ");
                    ogrenciAramaMethodu(scan.next());
                } else if (secim == 2)
                    menu();
                else if (secim == 3)
                    System.exit(0);
                else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim = 5;
                scan.next();
            }
        } while (!(1 <= secim && secim <= 3));


    }

    public void ogrenciListelemeMethodu() { //done

        if (ogrList.isEmpty())
            System.out.println("Ogrenci listesinde kayıtlı ogrenci yoktur");
        else {
            for (Ogrenci each : ogrList) {
                System.out.println(each);
            }
        }
    }

    public void listelemeKontrolMethodu() {
        do {
            System.out.println("\n\nAna menuye donmek icin     >> 1 " +
                    "\nCikis yapmak icin          >> 2 'e basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    menu();
                } else if (secim == 2)
                    System.exit(0);
                else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim = 5;
                scan.next();
            }
        } while (!(secim == 1 || secim == 2));
    }

    public void ogrenciSilmeMethodu(String tcNo) {

        boolean kontrol = true;
        for (int i = 0; i < ogrList.size(); i++) {
            if (ogrList.get(i).getTc().equalsIgnoreCase(tcNo)) {
                ogrList.remove(ogrList.get(i));
                break;
            } else {
                kontrol = false;
            }
        }
        if (!kontrol) System.out.println("Aradiginiz TC no'ya ait ogrenci bilgisi bulunamadi \n\n");

        do {
            System.out.println("Baska ogrenci silmek icin  >> 1 " +
                    "\nAna menuye donmek icin     >> 2 " +
                    "\nCikis yapmak icin          >> 3 'e basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    System.out.println("Silmek istediginiz ogrencinin TC numarasini giriniz : ");
                    ogrenciSilmeMethodu(scan.next());
                } else if (secim == 2)
                    menu();
                else if (secim == 3)
                    System.exit(0);
                else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim = 5;
                scan.next();
            }
        } while (!(1 <= secim && secim <= 3));
    }

    public String tcNoKontrol(String tc) {

        String [] tcArr =  tc.split("");
        boolean tckontrol=true;
        do {
            System.out.println("Tc numaranizi giriniz :");
            for (int i = 0; i < tcArr.length ; i++) {
                if (!Character.isDigit(tcArr[i].charAt(0))) {
                    System.out.println("Hatali tc no girisi : ");
                    tckontrol = false;
                    break;
                }
                tckontrol=true;
            }
        }while (!tckontrol);

       return  tc;

    }

    /*
    public String isimKotrolu(String isim){

        if (!isim.contains("\\W")){
            return isim;
        } else {
        while (isim.contains("\\W")){
            System.out.println("Girilen isim hatali, tekrar deneyiniz :");
            isim = scan.nextLine();
            }
            return isim;
        }
    }
    */

}

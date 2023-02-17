package myProjects.okulYonetimPlatformuProjesi_bitmedi_;

import java.util.*;

public class OgrenciMethodlari extends M02_OgrenciMenu implements InterfaceIslemler {

    Scanner scan = new Scanner(System.in);
    int okulNo = 1000;
    int secim ;
    List<K02Ogrenci> ogrenciList = new ArrayList<>();

    @Override
    public void eklemeMethodu() {
        System.out.print("Lutfen ogrencinin adini giriniz : ");
        scan.next();
        String ad = scan.nextLine();
        System.out.print("Lutfen ogrencinin soyadini giriniz : ");
        String soyAd = scan.nextLine();
        System.out.print("Lutfen ogrencinin TC no'sunu giriniz : ");
        String tc = scan.next();
        System.out.print("Lutfen ogrencinin yasini giriniz : ");
        int yas = scan.nextInt();
        System.out.println("Lutfen ogrencinin okul numarasi : " + ++okulNo);
        System.out.print("Lutfen ogrencinin sinifini giriniz : ");
        int sinif = scan.nextInt();

        K02Ogrenci ogrenci= new K02Ogrenci(ad,soyAd,tc,yas,++okulNo,sinif);
        ogrenciList.add(ogrenci);
        System.out.println("Kayit basarili\n\n");

        do {
            System.out.println("Baska ogrenci kaydi icin         >> 1 " +
                             "\nBir onceki menuye donmek icin    >> 2 " +
                             "\nAna menuye donmek icin           >> 3 " +
                             "\nCikis yapmak icin                >> 4 'e basiniz.");
            try {
                secim=scan.nextInt();
                if (secim==1) {
                    eklemeMethodu();
                }else if (secim==2)
                    M02_OgrenciMenu.ogrenciMenu();
                else if (secim==3)
                    M01_AnaMenu.menuu();
                else if (secim==4) {
                    System.out.println("**********Sistemden Cıkılıyor**********");
                    System.exit(0);
                }else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim=5;
                scan.next();
            }
        }while (!(1<=secim && secim<=4));

    }

    @Override
    public void aramaMethodu() {
        System.out.println("Aramak isdediginiz ogrencinin tc kimlik numarasini giriniz : ");
        String tc = scan.next();
        boolean kontrol = true;
        for (int i = 0; i <ogrenciList.size() ; i++) {
            if (ogrenciList.get(i).getTc().equalsIgnoreCase(tc))
                ogrenciList.remove(i);
            else
                kontrol=false;
        }
        if (!kontrol) System.out.println("Bu TC no ile kayitli ogrenci bulunmamaktadır");


        do {
            System.out.println("Baska ogrenci aramak icin        >> 1 " +
                             "\nBir onceki menuye donmek icin    >> 2 " +
                             "\nAna menuye donmek icin           >> 3 " +
                             "\nCikis yapmak icin                >> 4 'e basiniz.");
            try {
                secim=scan.nextInt();
                if (secim==1) {
                    aramaMethodu();
                }else if (secim==2)
                    M02_OgrenciMenu.ogrenciMenu();
                else if (secim==3)
                    M01_AnaMenu.menuu();
                else if (secim==4) {
                    System.out.println("**********Sistemden Cıkılıyor**********");
                    System.exit(0);
                }else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim=5;
                scan.next();
            }
        }while (!(1<=secim && secim<=4));
    }

    @Override
    public void listelemeMethodu() {
        if (ogrenciList.isEmpty())
            System.out.println("Ogrenci listesinde kayıtlı ogrenci yoktur");
        else {
            for (K02Ogrenci each : ogrenciList) {
                System.out.println(each);
            }
        }

    }
    /*
    public void kontrolMethodu (){
        do {
            System.out.println("\n\nOgrenci İslemleri menusune donmek icin     >> 1 " +
                                 "\nOgretmen İslemleri menusune donmek icin    >> 2"+
                                 "\nAna Menuye donmek icin                     >> 3 'e basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    M02_OgrenciMenu.ogrenciMenu();
                } else if (secim == 2)
                    M03_OgretmenMenu.ogretmenMenu();
                else if (secim==3)
                    System.exit(0);
                else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim = 5;
                scan.next();
            }
        } while (!(secim == 1 || secim == 2 || secim==3));
    }

     */

    @Override
    public void silmeMethodu() {

        System.out.println("Lutfen silmek istediginiz ogrencinin TC numarasini giriniz : ");
        String tc = scan.next();
        boolean kontrol = true;
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTc().equalsIgnoreCase(tc)) {
                ogrenciList.remove(ogrenciList.get(i));
                break;
            } else {
                kontrol = false;
            }
        }
        if (!kontrol) System.out.println("Aradiginiz TC no'ya ait ogrenci bilgisi bulunamadi \n\n");

        do {
            System.out.println("Baska ogrenci silmek icin        >> 1 " +
                    "\nBir onceki menuye donmek icin    >> 2 " +
                    "\nAna menuye donmek icin           >> 3 " +
                    "\nCikis yapmak icin                >> 4 'e basiniz.");
            try {
                secim=scan.nextInt();
                if (secim==1) {
                    aramaMethodu();
                }else if (secim==2)
                    M02_OgrenciMenu.ogrenciMenu();
                else if (secim==3)
                    M01_AnaMenu.menuu();
                else if (secim==4) {
                    System.out.println("**********Sistemden Cıkılıyor**********");
                    System.exit(0);
                }else
                    System.out.println("Hatali giris yaptiniz!!");
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz!!");
                secim=5;
                scan.next();
            }
        }while (!(1<=secim && secim<=4));

    }
}

package miniProjeler.okulYonetimPlatformuProjesi__BİTMEDİ__;

import miniProjeler.ogrenciYonetimPlatformuProjesi__BİTMEDİ__.Ogrenci;

import java.util.Scanner;

public class M02_OgrenciMenu  {

    static int secim;
    static String kontrol;
    static Scanner scan = new Scanner(System.in);

    public static void ogrenciMenu() {

        System.out.println("=======================================");
        System.out.println("=========== ÖĞRENCİ İŞLEMLERi =========\n\n" +
                           "             1-EKLEME\n" +
                           "             2-ARAMA\n" +
                           "             3-LİSTELEME\n" +
                           "             4-SİLME\n" +
                           "             Q-ÇIKIŞ\n\n");
        do {
            System.out.print("\tSEÇİMİNİZ : ");
            try {
                secim = scan.nextInt();
            } catch (Exception e) {
                kontrol = scan.next();
                if (kontrol.equalsIgnoreCase("q")) {
                    M01_AnaMenu.menuu();
                } else
                    secim = 5;
            }
            switch (secim) {
                case 1:

                    break;
                case 2:
                    System.out.print("Aramak istediginiz ogrencinin TC numarasini giriniz : ");

                    break;
                case 3:

                    break;
                case 4:

                    System.out.print("Silmek istediginiz ogrencinin TC numarasini giriniz : ");

                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz : ");
            }
        } while (!(1 <= secim && secim <= 4));
    }






}

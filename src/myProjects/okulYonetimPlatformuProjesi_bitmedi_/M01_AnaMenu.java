package myProjects.okulYonetimPlatformuProjesi_bitmedi_;

import java.util.Scanner;

public class M01_AnaMenu {

    /*
    1- ÖĞRENCİ İŞLEMLERİ
    2- ÖĞRETMEN İŞLEMLERİ
    Q- ÇIKIŞ
     */
    static int secim;
    static String kontrol;
    static Scanner scan=new Scanner(System.in);
    public static void menuu (){

        System.out.println("====================================\n" +
                           " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                           "====================================\n" +
                            " \t\t1- ÖĞRENCİ İŞLEMLERİ\n" +
                            " \t\t2- ÖĞRETMEN İŞLEMLERİ\n" +
                            " \t\tQ- ÇIKIŞ");

        do {
            System.out.print("\tSEÇİMİNİZ : ");
            try {
                secim = scan.nextInt();
            } catch (Exception e) {
                kontrol = scan.next();
                if (kontrol.equalsIgnoreCase("q")) {
                    System.out.println("**********  Sistemden Cikildi  **********");
                    System.exit(0);
                }
                else
                    secim=5;
            }
            switch (secim){
                case 1 :
                    // ogr islemleri
                    break;
                case 2 :
                    // ogr isl
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz : ");
            }
        }while (!(secim==1 || secim==2));
    }
}

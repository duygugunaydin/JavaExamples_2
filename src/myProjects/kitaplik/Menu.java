package myProjects.kitaplik;

import java.util.Scanner;

public class Menu extends Kitap{
    int secim;
    String kontrol;
    Scanner scan = new Scanner(System.in);

    public void menu() throws InterruptedException {
        Methodlar methodlar=new Methodlar();

        System.out.println("\n======= WQ KİTAPLIĞINA HOŞGELDİNİZ =======\n" +
                "\t\t1- KİTAP EKLE\n" +
                "\t\t2- NUMARA İLE KİTAP GÖRÜNTÜLE\n" +
                "\t\t3- BİLGİ İLE kİTAP GÖRÜNTÜLE\n" +
                "\t\t4- NUMARA İLE kİTAP SİL\n" +
                "\t\t5- TÜM KİTAPLARI LİSTELE\n" +
                "\t\t6- ÇIKIŞ\n");

        do {
            System.out.print("\tSEÇİMİNİZ : ");
            try {
                secim = scan.nextInt();
            } catch (Exception e) {

                secim = 10;  // switch'de default degere gondermek icin ;
                scan.next();

            }
            switch (secim) {
                case 1:
                    methodlar.kitapEkleMethodu1();
                    break;
                case 2:
                    methodlar.kitapNoIleKitapGoruntuleme2();
                    break;
                case 3:
                    methodlar.bilgiIleKitapGoruntulemeMethodu3();
                    break;
                case 4:
                    methodlar.kitapNoIleKitapSilmeMethodu4();
                    break;
                case 5:
                    methodlar.tumKitaplariListelemeMethodu5();
                    break;
                case 6:
                    methodlar.cikisMethodu6();
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz;\n");
            }
        } while (!(1 <= secim && secim <= 6));

    }

}


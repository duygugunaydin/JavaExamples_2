package myProjects.kitaplik;

public class Methodlar extends Menu {

    static int kitapNumarasi= 1000;
    Menu menu=new Menu();

    public void kitapEkleMethodu1() throws InterruptedException {

        System.out.print("Lutfen eklemek istediginiz kitabin adini giriniz : ");
        String kAdi = scan.next();
        System.out.print("Lutfen eklemek istediginiz kitabin yazarini giriniz : ");
        String kYazari = scan.next();
        System.out.print("Lutfen eklemek istediginiz kitabin fiyatini giriniz : ");
        double kFiyati;
        do {
            try {
                kFiyati = scan.nextDouble();
            } catch (Exception e) {
                kFiyati=0;
                scan.nextLine();
                System.out.print("Hatali giris yaptiniz.Lutfen tekrar deneyiniz : ");
            }
        }while (kFiyati==0);
        Kitap yeniKitap = new Kitap(++kitapNumarasi,kAdi,kYazari,kFiyati);
        kitapList.add(yeniKitap);
        System.out.println("Kitapbiniz ekleniyor...");
        Thread.sleep(500);
        System.out.println("Kayit basarili ! \n\nKitaplariniz : ");
        for (Kitap eachbook : kitapList) {System.out.println(eachbook);}
        System.out.println("");

        do {
            System.out.print("Baska kitap eklemek icin >> 1\n" +
                             "Menuye donmek icin       >> 2\n" +
                             "Cikis yapmak icin        >> 3'e basiniz  :  ");
            try {
                secim=scan.nextInt();
                if (secim==1)
                    kitapEkleMethodu1();
                else if (secim==2)
                    menu.menu();
                else if (secim==3) {
                    cikisMethodu6();
                }else
                    System.out.println("Hatali secim yapildi.Lutfen tekrar deneyiniz");
            } catch (Exception e) {
                kontrol=scan.next();
                System.out.println("Hatali giris yapildi.Lutfen tekrar deneyiniz : ");
                secim = 5;
            }
        }while (!(1<=secim && secim<=3));

        System.out.println();
    }
    /******************************************************************************************/
    ////////////////////////////////////////////////////////////////////////////////////////////////
    /******************************************************************************************/

    public void kitapNoIleKitapGoruntuleme2() throws InterruptedException {


        int ktpNo;

        do {
            System.out.print("Lutfen goruntulemek istediginiz kitabin numarasini giriniz : ");
            try {
                ktpNo = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Hatali giris..(Kayitlar 1000'den baslamaktadir ve sadece rakamdan olusmaktadir.) ");
                ktpNo=0;
                scan.nextLine();
            }
        }while (ktpNo==0);

        boolean kontrolvarMi = false;

        System.out.println("Kontrol ediliyor...");
        Thread.sleep(500);

        for (int i = 0; i <kitapList.size() ; i++) {
            if (kitapList.get(i).getKitapNo() == ktpNo) {
                System.out.println("\nAradiginiz kitap bilgileri : \n" + kitapList.get(i));
                kontrolvarMi=true;
            }
        }
        if (!kontrolvarMi)
            System.out.println("Aradiginiz numaraya kayitli kitap bilgisi yok.\n");

        do {
            System.out.println("");
            System.out.print("Baska kitap aramak icin  >> 1\n" +
                             "Menuye donmek icin       >> 2\n" +
                             "Cikis yapmak icin        >> 3'e basiniz  :  ");
            try {
                secim=scan.nextInt();
                if (secim==1)
                    kitapNoIleKitapGoruntuleme2();
                else if (secim==2)
                    menu.menu();
                else if (secim==3) {
                    cikisMethodu6();
                }else
                    System.out.println("Hatali secim yapildi.Lutfen tekrar deneyiniz");
            } catch (Exception e) {
                kontrol=scan.next();
                System.out.println("Hatali giris yapildi.Lutfen tekrar deneyiniz : ");
                secim = 5;
            }
        }while (!(1<=secim && secim<=3));

    }
    /******************************************************************************************/
    ////////////////////////////////////////////////////////////////////////////////////////////////
    /******************************************************************************************/

    public void bilgiIleKitapGoruntulemeMethodu3(){

        System.out.print("Lutfen aradiginiz kitabin ismini giriniz : ");
        String ktpIsmi = scan.nextLine();
        System.out.print("Lutfen aradiginiz kitabin yazarini giriniz : ");
        String yzrIsmi = scan.nextLine();
        System.out.println("");

        boolean kitapVarMi = false;

        for (int i = 0; i <kitapList.size() ; i++) {
            if (kitapList.get(i).getYazarAdi().equalsIgnoreCase(yzrIsmi)
                &&
                kitapList.get(i).getKitapAdi().equalsIgnoreCase(ktpIsmi)) {
                System.out.println("Aradiginiz kitap bilgileri : " + kitapList.get(i));
                kitapVarMi = true;
            }
        }
        if (!kitapVarMi) {
            System.out.println("Kayitlarda " + yzrIsmi +"'a ait " + ktpIsmi + " isimli kitap bilgisi yok.\n");
        }

        do {
            System.out.print( "\nBaska aramak yapmak icin  >> 1\n" +
                                "Menuye donmek icin        >> 2\n" +
                                "Cikis yapmak icin         >> 3'e basiniz  :  ");
            try {
                secim=scan.nextInt();
                if (secim==1) {
                    scan.nextLine();
                    bilgiIleKitapGoruntulemeMethodu3();
                }else if (secim==2)
                    menu.menu();
                else if (secim==3) {
                    cikisMethodu6();
                }else
                    System.out.println("Hatali secim yapildi.Lutfen tekrar deneyiniz");
            } catch (Exception e) {
                kontrol=scan.next();
                System.out.println("Hatali giris yapildi.Lutfen tekrar deneyiniz : ");
                secim = 5;
            }
        }while (!(1<=secim && secim<=3));

    }

    /******************************************************************************************/
    ////////////////////////////////////////////////////////////////////////////////////////////////
    /******************************************************************************************/

    public void kitapNoIleKitapSilmeMethodu4() throws InterruptedException {

        int ktpNo ;
        do {
            System.out.print("Lutfen silmek istediginiz kitabin numarasini giriniz : ");
            try {
                ktpNo = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Hatali giris..(Kayitlar 1000'den baslamaktadir ve sadece rakamdan olusmaktadir.) ");
                ktpNo=0;
                scan.nextLine();

            }
        }while (ktpNo==0);

        System.out.println("");
        System.out.println("Kayitlar kontrol ediliyor...");
        Thread.sleep(1000);
        boolean kontrolvarMi = false;
        for (int i = 0; i <kitapList.size() ; i++) {
            if (kitapList.get(i).getKitapNo() == ktpNo) {
                System.out.println(kitapList.get(i) + " KAYDI BASARI ILE SILINDI\n");
                kitapList.remove(i);
                System.out.println("Yeni kitap listesi : ");
                tumKitaplariListelemeMethodu5();
                System.out.println("");
                kontrolvarMi=true;
            }
        }
        if (!kontrolvarMi)
            System.out.println("Aradiginiz numaraya kayitli kitap bilgisi yok.\n");

        do {
            System.out.print("Baska kitap silmek icin  >> 1\n" +
                    "Menuye donmek icin       >> 2\n" +
                    "Cikis yapmak icin        >> 3'e basiniz  :  ");
            try {
                secim=scan.nextInt();
                if (secim==1)
                    kitapNoIleKitapSilmeMethodu4();
                else if (secim==2)
                    menu.menu();
                else if (secim==3) {
                    cikisMethodu6();
                }else
                    System.out.println("Hatali secim yapildi.Lutfen tekrar deneyiniz");
            } catch (Exception e) {
                kontrol=scan.next();
                System.out.println("Hatali giris yapildi.Lutfen tekrar deneyiniz : ");
                secim = 5;
            }
        }while (!(1<=secim && secim<=3));
    }

    /******************************************************************************************/
    ////////////////////////////////////////////////////////////////////////////////////////////////
    /******************************************************************************************/
    public void tumKitaplariListelemeMethodu5() throws InterruptedException {

        System.out.println("Kitaplar sorgulaniyor...");
        Thread.sleep(2000);

        if (kitapList.isEmpty())
            System.out.println("Kitap listesinde kitap bulunmamaktadir.");
        else {
            for (Kitap eachbook : kitapList) {
                System.out.println(eachbook);
            }
        }
        do {
            System.out.print("\nMenuye donmek icin       >> 1" +
                             "\nCikis yapmak icin        >> 2'e basiniz  :  ");
            try {
                secim=scan.nextInt();
                if (secim==1)
                    menu.menu();
                else if (secim==2){
                    cikisMethodu6();
                }else
                    System.out.println("Hatali secim yapildi.Lutfen tekrar deneyiniz");
            } catch (Exception e) {
                kontrol=scan.next();
                System.out.println("Hatali giris yapildi.Lutfen tekrar deneyiniz : ");
                secim = 5;
            }
        }while (!(secim==1 && secim==2));

    }
    /******************************************************************************************/
    ////////////////////////////////////////////////////////////////////////////////////////////////
    /******************************************************************************************/

    public void cikisMethodu6() throws InterruptedException {

        System.out.print("\n\nSistemden Cikis Yapiliyor ");
        Thread.sleep(500);
        System.out.print(" .");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(200);
        System.out.println("\n**********Sistemden Cikis Yapildi*************");
        System.exit(0);
    }
}

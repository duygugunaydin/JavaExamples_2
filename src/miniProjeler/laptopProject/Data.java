package miniProjeler.laptopProject;

import java.util.*;

public class Data {

    String marka;
    String model;
    String ram;
    String cpu;
    String renk;
    static int laptopID = 100;
    List<String> toplama = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);


    public Data() throws InterruptedException {

        System.out.println("Java Tech magazalarina hos geldiniz. Lutfen size sunulan menuden sirasi ile istediginiz bilgisayar bilesenlerini seciniz.");

        alisveris();

    }

    public Data(String marka, String model, String ram, String cpu, String renk) {

        laptopID = (++laptopID);
        this.marka = marka;
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.renk = renk;
    }


    public void alisveris() throws InterruptedException {
        String islem = "";
        do {


            ArrayList<String> temp = menu();
            toplama.addAll(temp);
            toplama.stream().forEach(t -> System.out.println(t));
            System.out.println("Alisverise devam etmek icin 1'e, alisverisi tamamlamak icin 2'ye basiniz");
            islem = scan.next();

        } while (!islem.equals("2"));

        System.out.println("Odeme icin kasaya yonlendiriliyorsunuz...");
        Thread.sleep(2000);
        Fiyat kasa = new Fiyat();
        kasa.getPrice(toplama);
    }


    public ArrayList<String> menu() {

        String islem = "";

        String marka = "";

        do {
            System.out.println("Lutfen istediginiz bilgisiyar markasinin numarasini giriniz: ");

            System.out.println("1- Apple \n2- Samsung \n3- Asus \n4- Lenovo \n5- Casper \n6- Monster");

            String rakam = scan.next();

            switch (rakam) {
                case "1":
                    marka = "Apple";
                    break;
                case "2":
                    marka = "Samsung";
                    break;
                case "3":
                    marka = "Asus";
                    break;
                case "4":
                    marka = "Lenovo";
                    break;
                case "5":
                    marka = "Casper";
                    break;
                case "6":
                    marka = "Monster";
                default:
                    System.out.println("Lutfen sunulan seceneklerden birini seciniz!");
                    break;
            }
        } while (marka == "");

        String model = "";

        do {

            System.out.println("Lutfen istediginiz modelin numarasini giriniz: ");

            System.out.println("1- Mini: $" + Bilesenler.sizeMini.fiyat + "\n2- Middle: $" + Bilesenler.sizeMiddle.fiyat + "\n3- Max: $" + Bilesenler.sizeMax.fiyat);

            String modelNo = scan.next();

            int modelFiyat = 0;

            switch (modelNo) {
                case "1":
                    model = "Mini";
                    modelFiyat = Bilesenler.sizeMini.fiyat;
                    break;
                case "2":
                    model = "Middle";
                    modelFiyat = Bilesenler.sizeMiddle.fiyat;
                    break;
                case "3":
                    model = "Max";
                    modelFiyat = Bilesenler.sizeMax.fiyat;
                    break;
                default:
                    System.out.println("Lutfen sunulan seceneklerden birini seciniz!");
                    break;
            }
        } while (model == "");

        String ram = "";

        do {

            System.out.println("Lutfen istediginiz ram turunun numarasini giriniz: ");

            System.out.println("1- 32 GB: $" + Bilesenler.ram32GB.fiyat + "\n2- 16 GB: $" + Bilesenler.ram16GB.fiyat + "\n3- 8 GB: $" + Bilesenler.ram8GB.fiyat + "\n4- 6 GB: $" + Bilesenler.ram4GB.fiyat);

            String ramNo = scan.next();

            int ramFiyat = 0;

            switch (ramNo) {
                case "1":
                    ram = "32GB";
                    ramFiyat = Bilesenler.ram32GB.fiyat;
                    break;
                case "2":
                    ram = "16GB";
                    ramFiyat = Bilesenler.ram16GB.fiyat;
                    break;
                case "3":
                    ram = "8GB";
                    ramFiyat = Bilesenler.ram8GB.fiyat;
                    break;
                case "4":
                    ram = "4GB";
                    ramFiyat = Bilesenler.ram4GB.fiyat;
                    break;
                default:
                    System.out.println("Lutfen sunulan seceneklerden birini seciniz!");
                    break;
            }
        } while (ram == "");

        String islemci = "";

        do {

            System.out.println("Lutfen istediginiz islemcinin numarasini giriniz: ");

            System.out.println("1- I3: $" + Bilesenler.CPUI3.fiyat + "\n2- I5: $" + Bilesenler.CPUI5.fiyat + "\n3- I7: $" + Bilesenler.CPUI7.fiyat);

            String islemciNo = scan.next();

            int islemciFiyat = 0;

            switch (islemciNo) {
                case "1":
                    islemci = "I3";
                    islemciFiyat = Bilesenler.CPUI3.fiyat;
                    break;
                case "2":
                    islemci = "I5";
                    islemciFiyat = Bilesenler.CPUI5.fiyat;
                    break;
                case "3":
                    islemci = "I7";
                    islemciFiyat = Bilesenler.CPUI7.fiyat;
                    break;
                default:
                    System.out.println("Lutfen sunulan seceneklerden birini seciniz!");
                    break;
            }

        } while (islemci == "");


        String renk = "";

        do {

            System.out.println("Lutfen istediginiz rengin numarasini giriniz: ");

            System.out.println("1- Red: $" + Bilesenler.colorRed.fiyat + "\n2- Orange: $" + Bilesenler.colorOrange.fiyat + "\n3- Silver: $" + Bilesenler.colorSilver.fiyat + "\n4- Black: $" + Bilesenler.colorBlack.fiyat);

            String renkNo = scan.next();

            int renkFiyat = 0;

            switch (renkNo) {
                case "1":
                    renk = "Red";
                    renkFiyat = Bilesenler.colorRed.fiyat;
                    break;
                case "2":
                    renk = "Orange";
                    renkFiyat = Bilesenler.colorOrange.fiyat;
                    break;
                case "3":
                    renk = "Silver";
                    renkFiyat = Bilesenler.colorSilver.fiyat;
                    break;
                case "4":
                    renk = "Black";
                    renkFiyat = Bilesenler.colorBlack.fiyat;
                    break;
                default:
                    System.out.println("Lutfen sunulan seceneklerden birini seciniz!");
                    break;
            }
        } while (renk == "");


        Data pcBilesenler = new Data(marka, model, ram, islemci, renk);

        ArrayList<String> pc = new ArrayList();

        pc.add(String.valueOf(pcBilesenler));

        return pc;
    }


    @Override
    public String toString() {
        return "Laptop ID: " + laptopID +
                " -  Marka: " + marka +
                " -  Model: " + model +
                " -  Ram: " + ram +
                " -  Cpu: " + cpu +
                " -  Renk: " + renk;
    }
}



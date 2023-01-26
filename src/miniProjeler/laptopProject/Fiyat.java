package miniProjeler.laptopProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fiyat {

    static Scanner scan = new Scanner(System.in);

    public double getPrice(List<String> toplama) throws InterruptedException {

        Calculation cal = new Calculation();

        ArrayList<String> temp = new ArrayList<>();

        String odemeIslem = "";

        double discountAmount = 0;

        int totalAmount = 0;

        do {

            System.out.println("Odemek istediginiz urunun ID'sini giriniz. Tum urunleri odemek icin 1'e basiniz: ");
            String islem = scan.next();

            if (!islem.equals("1")) {


                temp = (ArrayList<String>) toplama.stream().filter(t -> t.contains(islem)).collect(Collectors.toList());


                for (int i = 0; i < toplama.size(); i++) {

                    if (toplama.get(i).contains(islem)) {
                        toplama.remove(toplama.get(i));
                    }
                }


                System.out.println("Odemesini yapacaginiz PC: ");
                temp.stream().forEach(t -> System.out.println(t));

                totalAmount += cal.getRam(temp);
                totalAmount += cal.getCPU(temp);
                totalAmount += cal.getColor(temp);
                totalAmount += cal.getSize(temp);


            } else {

                temp = (ArrayList<String>) toplama.stream().collect(Collectors.toList());
                System.out.println("Toplam Liste : ");
                temp.stream().forEach(t -> System.out.println(t));

                for (int i = 0; i < temp.size(); i++) {

                    totalAmount += cal.getRam(temp);
                    totalAmount += cal.getCPU(temp);
                    totalAmount += cal.getColor(temp);
                    totalAmount += cal.getSize(temp);

                }

                toplama.clear();
            }

            discountAmount = getDiscount(totalAmount, 20);
            System.out.println("Odemeniz gereken tutar: $" + totalAmount + ". Bugune ozel %20 indirim firsati yakaladiniz. Indirim sonrasi odemeniz gereken tutar: $" + discountAmount);
            System.out.println("Sepetiniz kontrol ediliyor...");
            Thread.sleep(4000);


            if (toplama.isEmpty()) {

                break;

            } else {

                System.out.println("Odeme yapilmasi gereken diger urunler: ");
                toplama.stream().forEach(t -> System.out.println(t));

                System.out.println("Odemeye devam etmek istiyosaniz 1'i alisverisi tamamlamak istiyorsaniz 2'yi tuslayiniz: ");

                odemeIslem = scan.next();
            }


        } while (!odemeIslem.equals("2"));
        System.out.println("Odemeniz aliniyor...");
        Thread.sleep(2000);
        System.out.println("JAVA TECH magazalarini tercih ettiginiz icin tesekkur ederiz!");
        return discountAmount;

    }

    public double getDiscount(int x, int y) {

        double discount = x * y / 100;

        double amount = x - discount;

        return amount;
    }

}

package miniProjeler.laptopProject;

import java.util.ArrayList;

public class Calculation {


    public int getRam(ArrayList<String> x) {

        String a = String.valueOf(x);

        int price = 0;

        if (a.contains("32GB")) {
            price = Bilesenler.ram32GB.fiyat;
        } else if (a.contains("16GB")) {
            price = Bilesenler.ram16GB.fiyat;
        } else if (a.contains("8GB")) {
            price = Bilesenler.ram8GB.fiyat;
        } else if (a.contains("4GB")) {
            price = Bilesenler.ram4GB.fiyat;
        }

        return price;
    }


    public int getCPU(ArrayList<String> x) {

        String a = String.valueOf(x);

        int price = 0;

        if (a.contains("I3")) {
            price = Bilesenler.CPUI3.fiyat;
        } else if (a.contains("I5")) {
            price = Bilesenler.CPUI5.fiyat;
        } else if (a.contains("I7")) {
            price = Bilesenler.CPUI7.fiyat;
        }

        return price;
    }


    public int getColor(ArrayList<String> x) {

        String a = String.valueOf(x);

        int price = 0;

        if (a.contains("Red")) {
            price = Bilesenler.colorRed.fiyat;
        } else if (a.contains("Silver")) {
            price = Bilesenler.colorSilver.fiyat;
        } else if (a.contains("Orange")) {
            price = Bilesenler.colorOrange.fiyat;
        } else if (a.contains("Black")) {
            price = Bilesenler.colorBlack.fiyat;
        }

        return price;
    }


    public int getSize(ArrayList<String> x) {

        String a = String.valueOf(x);

        int price = 0;

        if (a.contains("Mini")) {
            price = Bilesenler.sizeMini.fiyat;
        } else if (a.contains("Middle")) {
            price = Bilesenler.sizeMiddle.fiyat;
        } else if (a.contains("Max")) {
            price = Bilesenler.sizeMax.fiyat;
        }

        return price;
    }
}

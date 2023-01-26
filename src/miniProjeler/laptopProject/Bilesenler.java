package miniProjeler.laptopProject;

public enum Bilesenler {

    ram32GB(300),
    ram16GB(200),
    ram8GB(100),
    ram4GB(50),

    CPUI3(200),
    CPUI5(300),
    CPUI7(500),

    colorRed(400),
    colorOrange(300),
    colorSilver(200),
    colorBlack(150),

    sizeMini(100),
    sizeMiddle(200),
    sizeMax(300);

    int fiyat;

    Bilesenler(int i) {

        this.fiyat = i;
    }

}

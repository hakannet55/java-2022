import interfacedeneme.interfaceDeneme;

public class Main {
    // Class sample examples
    public static void main(String[] args) {
        // referance type
        Utils.print("start-1");

        // ekrana sayı gir ve enter'e bas
        //Scanner scan=new Scanner(System.in);
        //double girilenDeger = Double.parseDouble(scan.nextLine());
        double girilenDeger = 100;
        BaseKrediManager manager = new IhtiyacKrediManager();
        String result = manager.hesapla(girilenDeger);
        Utils.print("sonuc:" + result);

        // video Java Dersi 44 demo
        new interfaceDeneme().start();

    }

}


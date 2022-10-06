import interfacedeneme.interfaceDeneme;
import kodlamaio.KodlamaMain;

public class Main {
    // Class sample examples
    public static void main(String[] args) throws Exception {
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

        // Kodlama io
        // Kurs kategori, kurs programı, database
        new KodlamaMain().start();

    }

}


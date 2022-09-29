package inheritence2;

public class Inheritance2 {
    public static void start() {
        OgretmenKrediManager manager1 = new OgretmenKrediManager();

        KrediUI manager = new KrediUI();
        manager.KrediHesapla(manager1);

        TarimKrediManager base = new TarimKrediManager();
        base.Hesapla();

        OgretmenKrediManager base2 = new OgretmenKrediManager();
        base2.Hesapla();
    }
}
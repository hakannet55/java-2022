package odevler;

public class arrays {
    public static void main() {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Ayşe";
        String ogrenci3 = "Mehmet";

        System.out.print(ogrenci1);

        System.out.print("---");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        System.out.print(ogrenciler);
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.print(ogrenciler[i]);
        }

        System.out.print("---");
        
        String[] users = {"Ali", "mehmet", "ayşe"};
        for (String userName : users) {
            System.out.print(userName);
        }

    }
}

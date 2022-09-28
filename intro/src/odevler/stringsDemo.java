package odevler;

public class stringsDemo {
    public static void main() {
        String mesaj = "Bugun hava çok güzel";

        print("mesaj uzunlugu:" + mesaj.length());
        print("mesaj karakter 4. => " + mesaj.charAt(4));
        // Char firstChar = mesaj.charAt(0);

        print(mesaj.concat(" ilave cümle"));
        char[] chrFind = new char[5];
        mesaj.getChars(0, 5, chrFind, 0);
        System.out.println(chrFind);
        print(mesaj.startsWith("B"));
        System.out.println(mesaj.indexOf('d'));
        System.out.println(mesaj.indexOf('a'));
        print(mesaj);
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void print(boolean msg) {
        System.out.print(msg);
    }
}

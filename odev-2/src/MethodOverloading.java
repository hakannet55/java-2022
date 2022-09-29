public class MethodOverloading {
    public static void start() {
        int toplam1 = topla(1, 2);
        int toplam2 = topla(1, 2, 3);
        System.out.println(Integer.toString(toplam1) + "-" + Integer.toString(toplam2));
    }

    ;

    public static int topla(int say1, int say2) {
        return say1 + say2;
    }

    public static int topla(int say1, int say2, int say3) {
        return say1 + say2 + say3;
    }
}

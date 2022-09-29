package functions;

public class main {
    public static void main(String[] args) {
        int summary = topla(5, 4, 5, 1);
        System.out.println(summary);


        DortIslem islem = new DortIslem();
        int sonuc = islem.Topla(2, 4);
        System.out.println(sonuc);


    }


    public static int topla(int... numbers) {
        int result = 0;
        for (int sub : numbers) {
            result += sub;
        }
        return result;
    }

}

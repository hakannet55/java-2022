package odevler;

public class multiDimentional {
    public static void main() {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Sinop";
        sehirler[1][0] = "Karabük";
        sehirler[1][1] = "Afyon";
        sehirler[2][0] = "Hatay";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("bolge:" + i + " sehir:" + sehirler[i][j]);
            }
        }


    }
}

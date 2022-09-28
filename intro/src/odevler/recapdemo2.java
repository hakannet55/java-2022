package odevler;

public class recapdemo2 {
    public static void recapdemo2() {
        double[] list = {1.2, 1.52, 3.2, 3.4, 5.2};
        double total = 0;
        for (double item : list) {
            System.out.print(item);
            total = total + item;
        }
        System.out.print("total:" + total);
    }
}

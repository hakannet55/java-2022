package odevler;

public class loopTest {
    public void loopTest() {
        // for loop
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("run:" + i);
        }
        System.out.println("last:" + i);
        int index = 1;
        while (i < 10) {
            System.out.println("run:" + i);
            index += 2;
        }
        System.out.println("last:" + i);

        // if j=15 cant run while
        int j = 0;
        do {
            j += 2;
            System.out.println("do-white:" + i);
        } while (j < 10);
    }
}

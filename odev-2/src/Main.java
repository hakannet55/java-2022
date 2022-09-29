import inheritence2.Inheritance2;

public class Main {
    // Class sample examples
    public static void main(String[] args) {
        // referance type
        CustomerManager manager = new CustomerManager();
        manager.Add();
        manager.Remove();
        manager.Update();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 50;
        System.out.println(sayi1);

        int[] sayılar1 = new int[]{1, 2, 3};
        int[] sayılar2 = new int[]{4, 5, 6};
        sayılar2 = sayılar1;
        sayılar1[0] = 10;
        System.out.println(sayılar2[0]);

        // start another class in function
        new ClassesWithAttribute().start();

        // start MethodOverloading
        new MethodOverloading().start();

        // start Inheritance2 Kredi
        new Inheritance2().start();

    }


}


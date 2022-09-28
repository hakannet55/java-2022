public class Main {
    public static void main(String[] args) {
        // fields:
        int num1 = 10, n2 = 15, n3 = 2;
        int maxN = num1;

        if(maxN < n2)
            maxN = n2;
        if(maxN < n3)
            maxN = n3;

        System.out.println("Maximum value: " + maxN);
    }
}

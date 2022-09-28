public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,4, 5, 7, 9};
        int findNumber = 5;
        int index = 0;
        boolean check = false;

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == findNumber) {
                check = true;
                index = i;
                break;
            }

        if (check)
            System.out.println("index:" + index );
        else
            System.out.println("not exist in the array.");
    }
}

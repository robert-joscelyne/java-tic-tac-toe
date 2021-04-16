import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean descending = false;
        boolean ascending = false;

        int previousNumber = 0;

        while (true) {
            int value = Integer.parseInt(scanner.next());

            if (value == 0) {
                break;
            }


            if (value < previousNumber && previousNumber != 0) {
                descending = true;
            }

            if (value > previousNumber && previousNumber != 0) {
                ascending = true;
            }

            previousNumber = value;
        }

        System.out.println(!(descending && ascending));
    }
}
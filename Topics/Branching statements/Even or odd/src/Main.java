import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value == 0) {
                break;
            }

            String output = "odd";
            if (value % 2 == 0) {
                output = "even";
            }

            System.out.println(output);
        }
    }
}
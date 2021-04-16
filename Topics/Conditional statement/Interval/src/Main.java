import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean result = false;

        if (number > -15 && number <= 12) {
            result = true;
        } else if (number > 14 && number < 17) {
            result = true;
        } else if (number >= 19) {
            result = true;
        }

        System.out.println(result ? "True" : "False");
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int segments = Integer.parseInt(scanner.nextLine());

        boolean result = false;

        if (segments % rows == 0) {
            result = true;
        } else if (segments % columns == 0) {
            result = true;
        }

        if (segments > (rows * columns)) {
            result = false;
        }

        System.out.println(result ? "YES" : "NO");
    }
}
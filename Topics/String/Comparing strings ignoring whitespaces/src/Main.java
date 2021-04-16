import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        String string1Trimmed = trimString(string1);
        String string2Trimmed = trimString(string2);

        boolean result = string1Trimmed.equals(string2Trimmed);

        System.out.println(result ? "true" : "false");
    }

    private static String trimString(String string) {
        return string.trim().replace(" ", "");
    }
}
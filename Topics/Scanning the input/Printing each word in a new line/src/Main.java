import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int loop = 0; loop < 5; loop++) {
            System.out.println(readNextWord(scanner));
        }
    }

    private static String readNextWord(Scanner scanner) {
        String word = "";

        while (word.isEmpty()) {
            word = scanner.next().trim();
        }

        return word;
    }
}
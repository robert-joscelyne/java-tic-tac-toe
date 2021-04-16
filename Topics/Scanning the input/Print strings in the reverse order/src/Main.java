//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[3];

        for (int loop = 0; loop < 3; loop++) {
            words[loop] = scanner.nextLine();
        }

        for (int loop = 2; loop >= 0; loop--) {
            System.out.println(words[loop]);
        }
    }
}
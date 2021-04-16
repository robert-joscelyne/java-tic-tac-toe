//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];

        for (int loop = 0; loop < 5; loop++) {
            words[loop] = scanner.nextLine();
        }

        System.out.println("The form for " + words[0]
                + " is completed. We will contact you if we need a chef that cooks "
                + words[4] + " dishes.");
    }
}
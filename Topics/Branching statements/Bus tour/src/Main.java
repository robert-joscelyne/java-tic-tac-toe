import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = Integer.parseInt(scanner.next());
        int bridgeCount = Integer.parseInt(scanner.next());
        int[] bridgeHeights = new int[bridgeCount];

        for (int loop = 0; loop < bridgeCount; loop++) {
            bridgeHeights[loop] = Integer.parseInt(scanner.next());
        }

        String output = "Will not crash";

        for (int loop = 0; loop < bridgeCount; loop++) {
            if (busHeight >= bridgeHeights[loop]) {
                output = "Will crash on bridge " + (loop + 1);
                break;
            }
        }

        System.out.println(output);
    }
}
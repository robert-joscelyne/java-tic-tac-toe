import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int itemCount = scanner.nextInt();

        int[] candidates = new int[itemCount];

        for (int loop = 0; loop < itemCount; loop++) {
            candidates[loop] = scanner.nextInt();
        }

        int searchValue = scanner.nextInt();

        int occurrences = 0;

        for (int candidate : candidates) {
            if (candidate == searchValue) {
                occurrences++;
            }
        }

        System.out.println(occurrences);
    }
}
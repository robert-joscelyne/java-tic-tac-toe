import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int loop = 0; loop < arraySize; loop++) {
            array[loop] = scanner.nextInt();
        }

        int sequenceSize = 0;
        int largestSequence = 0;
        int previousValue = Integer.MAX_VALUE;

        for (int element : array) {
            if (element > previousValue) {
                sequenceSize++;
            } else {
                sequenceSize = 1;
            }

            if (sequenceSize > largestSequence) {
                largestSequence = sequenceSize;
            }

            previousValue = element;
        }

        System.out.println(largestSequence);
    }
}
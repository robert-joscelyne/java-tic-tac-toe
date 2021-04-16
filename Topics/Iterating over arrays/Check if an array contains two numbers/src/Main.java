import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementCount = scanner.nextInt();
        int[] elements = new int[elementCount];

        for (int loop = 0; loop < elementCount; loop++) {
            elements[loop] = scanner.nextInt();
        }

        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        boolean value1Found = false;
        boolean value2Found = false;

        boolean bothValuesFound = false;

        for (int element : elements) {
            if (element == value1) {
                value1Found = true;
            } else if (element == value2) {
                value2Found = true;
            } else {
                value1Found = false;
                value2Found = false;
            }

            if (value1Found && value2Found) {
                bothValuesFound = true;
                break;
            }
        }

        System.out.println(bothValuesFound);
    }
}
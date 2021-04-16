import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String word = scanner.nextLine();

        int subStringStart = Integer.parseInt(scanner.next());
        int subStringEnd = Integer.parseInt(scanner.next());

        String output = word.substring(subStringStart, subStringEnd + 1);

        System.out.println(output);
    }
}
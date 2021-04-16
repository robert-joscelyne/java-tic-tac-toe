import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long value1 = scanner.nextLong();
        String operator = scanner.next();
        long value2 = scanner.nextLong();

        // Check for Divide by Zero
        if ("/".equals(operator) && value2 == 0) {
            System.out.println("Division by 0!");
            return;
        }

        String output;
        switch (operator) {
            case "+" :
                output = String.valueOf(value1 + value2);
                break;
            case "-" :
                output = String.valueOf(value1 - value2);
                break;
            case "*" :
                output = String.valueOf(value1 * value2);
                break;
            case "/" :
                output = String.valueOf(value1 / value2);
                break;
            default:
                output = "Unknown operator";
                break;
        }

        System.out.println(output);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shapeNumber = scanner.nextInt();

        String shapeName;
        switch (shapeNumber) {
            case 1:
                shapeName = "square";
                break;
            case 2:
                shapeName = "circle";
                break;
            case 3:
                shapeName = "triangle";
                break;
            case 4:
                shapeName = "rhombus";
                break;
            default:
                shapeName = "There is no such shape!";
                break;
        }

        if (shapeNumber >= 1 && shapeNumber <= 4) {
            System.out.println("You have chosen a " + shapeName);
        } else {
            System.out.println(shapeName);
        }
    }
}
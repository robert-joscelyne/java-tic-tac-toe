class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {

        String output = "";

        for (int element: twoDimArray[2]) {
            output = output + " " + element;
        }

        output = output.trim();

        System.out.println(output);

    }
}
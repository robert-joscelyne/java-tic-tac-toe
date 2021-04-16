class ArrayOperations {

    public static void printCorners(int[][] twoDimArray) {
        int rows = twoDimArray.length - 1;
        int columns = twoDimArray[0].length - 1;

        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][columns]);
        System.out.println(twoDimArray[rows][0] + " " + twoDimArray[rows][columns]);

    }
}


class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] cube = new int[3][3][3];

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                for (int depth = 0; depth < 3; depth++) {
                    cube[row][column][depth] = column * 3 + depth;
                }
            }
        }

        return cube;
    }
}
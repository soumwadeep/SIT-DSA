class Find5Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 4, 6 },
                { 8, 5, 7 },
                { 1, 9, 3 }
        };

        int target = 5;
        int rowIndex = -1;
        int columnIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    rowIndex = i;
                    columnIndex = j;
                    break; // If found, exit the loop
                }
            }
            if (rowIndex != -1) {
                // If found, exit the outer loop as well
                break;
            }
        }

        if (rowIndex != -1 && columnIndex != -1) {
            System.out.println("Value " + target + " found at index (" + rowIndex + ", " + columnIndex + ")");
        } else {
            System.out.println("Value " + target + " not found in the matrix.");
        }
    }
}

import java.util.Scanner;

class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = readMatrix(sc, rows, cols, "Matrix 1");
        int[][] matrix2 = readMatrix(sc, rows, cols, "Matrix 2");
        int[][] sum = addMatrices(matrix1, matrix2, rows, cols);

        printMatrix(matrix1, "Matrix 1:");
        printMatrix(matrix2, "Matrix 2:");
        printMatrix(sum, "Sum of the two matrices:");

        sc.close();
    }

    private static int[][] readMatrix(Scanner sc, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix, String title) {
        System.out.println(title);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

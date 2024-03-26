import java.util.Scanner;
public class MatrisTranpozunuBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int rows = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int columns = scanner.nextInt();

        int[][] transpose = new int[rows][columns];

        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[j][i] = transpose[i][j];
            }
        }

        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoze:");
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

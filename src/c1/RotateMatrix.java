package c1;

public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix){
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] result = new int[y][x];
        for(int i = 0 ; i < result.length; i++) {
            for(int e = 0 ; e < result[0].length; e++) {
                result[e][i] = matrix[(matrix.length - 1) - i][e];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++) {
            for(int e = 0 ; e < matrix[0].length; e++) {
                System.out.print(matrix[i][e]);
            }
            System.out.print('\n');
        }
    }

    public static void main(String args[]){
        int[][] matrix = { {1,2,3,4}, {1,6,7,4}, {8,3,6,4}, {4,3,2,1} };

        printMatrix(matrix);
        System.out.print('\n');
        printMatrix(rotateMatrix(matrix));
    }
}
